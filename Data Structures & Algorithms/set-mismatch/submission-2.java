class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int counter =0;
        int ans[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
                hm.put(nums[i],1);
        }

        for(int j=0;j<nums.length;j++)
        {
            int num = j+1;

            if(hm.containsKey(num)==false)
                ans[1]= num;
            if(hm.containsKey(num) && hm.get(num)==2)
                ans[0]= num;
            
        }



        return ans;
        
    }
}