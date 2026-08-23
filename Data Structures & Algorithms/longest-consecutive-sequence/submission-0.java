class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> freq = new HashSet<>();

        for(int i=0;i<nums.length;i++)
            freq.add(nums[i]);

        int ans = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(!freq.contains(nums[i]-1))
            {
                int currentNum = nums[i];
                int currentStreak =1;
                while(freq.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;
                }

                ans = Math.max(ans,currentStreak);
            }
        }

        return ans;
        
    }
}
