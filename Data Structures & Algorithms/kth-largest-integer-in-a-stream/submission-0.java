class KthLargest {

    int kth;
    int num[]=new int [1000];
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.kth = k;
        for (int n : nums) {
            add(n);
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        System.out.println(kth);
        if (heap.size() > kth) {
            heap.poll();
        }
        return heap.peek();

    }
    }

