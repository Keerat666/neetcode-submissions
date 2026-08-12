class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[] = new int[2001];
        for (int n : nums) {
            freq[n + 1000]++;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                pq.add(new int[]{i - 1000, freq[i]});
                if (pq.size() > k) pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
