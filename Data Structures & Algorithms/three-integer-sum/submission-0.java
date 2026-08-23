class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List <List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++)
        {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int ele = nums[i];

            if(ele>0)
                return ans;
            else
            {
                int start = i+1;
                int end = nums.length-1;

                while(start<end)
                {
                    if(nums[start]+nums[end]+ele == 0)
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(ele);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        ans.add(list);
                        while (start < end && nums[start] == nums[start+1]) 
                        start++;
                        
                        while (start < end && nums[end] == nums[end-1]) 
                        end--;

                        start++;
                        end--;
                    }
                    else if(nums[start]+nums[end]+ele<0)
                    {
                        start++;
                    }
                    else
                        end--;
                }
            }

        }

        return ans;
        
    }
}
