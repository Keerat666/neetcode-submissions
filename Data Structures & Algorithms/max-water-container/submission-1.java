class Solution {
    public int maxArea(int[] heights) {

        //Brute force
        // int ans=0;

        // for(int i=0;i<heights.length;i++)
        // {
        //     for(int j=i+1;j<heights.length;j++)
        //     {
        //         int height1=heights[i];
        //         int height2=heights[j];
        //         int width = j-i;
        //         int area = Math.min(height1,height2)*width;
        //         ans = Math.max(area,ans);
        //     }
        // }

        // return ans;

        int start =0;
        int end=heights.length-1;
        int ans=0;

        while(start<end)
        {
            int height1=heights[start];
            int height2 = heights[end];
            int width = end-start;
            int area = Math.min(height1,height2)*width;
            ans=Math.max(ans,area);
            //condition to alter start and end to max the height via greedy
            if (heights[start] < heights[end]) 
                start++;
            else             
                end--;            
        }

        return ans;
        
    }
}
