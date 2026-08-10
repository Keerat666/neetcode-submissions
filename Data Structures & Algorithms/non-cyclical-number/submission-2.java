class Solution {
    public boolean isHappy(int n) {

        HashMap <Integer,Integer> hm = new HashMap<>();

        while(n>0)
        {
            int sod = sodg(n);

            if(sod==1)
                return true;
            else if(hm.containsKey(sod))
                return false;
            n=sod;
            hm.put(sod,n);
        }

        return false;
        
    }

    public static int sodg(int n)
    {
        int temp =n;
        int sodg =0;
        while(temp>0)
        {
            int dg = temp%10;
            sodg+=dg*dg;
            temp=temp/10;
        }

        return sodg;
    }
}
