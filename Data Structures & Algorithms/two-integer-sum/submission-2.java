class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> hm = new HashMap<>();
        int ans [] = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];

            if(hm.containsKey(diff))
            {
                int index = hm.get(diff);
                int index2 = i;
                if(index!=index2)
                {
                    ans[0]=index;
                    ans[1]=index2;
                }

            }
            else
                hm.put(nums[i],i);

        }

        return ans;
        
    }
}
