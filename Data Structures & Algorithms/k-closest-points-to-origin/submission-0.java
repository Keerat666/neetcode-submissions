class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Integer[]> heap = new PriorityQueue<>(

            (a, b) -> Integer.compare(a[0], b[0])
        );

        for(int i=0;i<points.length;i++)
        {
            int distance = points[i][0]*points[i][0] + points[i][1]*points[i][1] ;
            heap.offer(new Integer[]{distance, points[i][0], points[i][1]});
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Integer[] curr = heap.poll();
            result[i][0] = curr[1];
            result[i][1] = curr[2];
        }

        return result;

    }
}
