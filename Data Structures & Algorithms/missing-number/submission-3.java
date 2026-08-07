class Solution {
    public int missingNumber(int[] nums) {
        
        //freq approach - can also use a hashset
        // int [] freq = new int[nums.length+1];

        // for(int i=0;i<nums.length;i++)
        // {
        //     freq[nums[i]]=1;
        // }

        // for(int i=0;i<=nums.length;i++)
        // {
        //     if(freq[i]!=1)
        //         return i;

        // }

        // return -1;

        //xor approach
        int xorAns=0;
        
        for(int i=0;i<nums.length;i++)
        {
            xorAns=xorAns^nums[i];
        }

        for(int i=0;i<nums.length+1;i++)
        {
            xorAns=i^xorAns;
        }

        return xorAns;
    }
}
