class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] output = new int[nums.length];
        int prefix = 1;

        for (int index = 0; index < nums.length; index++)
        {
            output[index] = prefix;
            prefix = prefix *  nums[index];
        }

        int suffix = 1;

        for(int i=nums.length-1;i>=0;i--)
        {
            output[i] *= suffix;
            suffix = suffix * nums[i];
        }

        return output;

        
    }
}  
