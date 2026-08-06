class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int gift:gifts)
        {
            heap.offer(gift);
        }

        for(int i=0;i<k;i++)
        {
            int d = heap.poll();
            int update = (int)Math.floor(Math.sqrt(d));
            heap.offer(update);
        }

        int ans=0;

        while(heap.size()>0)
        {
            ans=ans+heap.poll();
        }

        return ans;
        
    }
}