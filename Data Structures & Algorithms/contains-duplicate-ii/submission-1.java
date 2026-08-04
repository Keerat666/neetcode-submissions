class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap <Integer,Integer> hm = new HashMap <>();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
               
                int initial_index = hm.get(nums[i]);
                int final_index = i;

                int s = Math.abs(initial_index-final_index);

                if(s<=k)
                    return true;
                else
                    hm.put(nums[i],i);
            }
            else
                hm.put(nums[i],i);
        }

        return false;
        
    }
}