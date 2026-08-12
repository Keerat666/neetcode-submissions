class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        int freq[]=new int[26];

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            char d = t.charAt(i);

            freq[c-'a']++;
            freq[d-'a']--;
        }

        for(int i : freq)
        {
            if(i!=0)
                return false;
        }




        // HashMap<Character,Integer> hm = new HashMap<>();

        // for(int i=0;i<s.length();i++)
        // {
        //     char c = s.charAt(i);

        //     if(hm.containsKey(c))
        //         hm.put(c,hm.get(c)+1);
        //     else
        //         hm.put(c,1);
        // }

        // HashMap<Character,Integer> hm2 = new HashMap<>();

        // for(int i=0;i<t.length();i++)
        // {
        //     char c = t.charAt(i);

        //     if(hm2.containsKey(c))
        //         hm2.put(c,hm2.get(c)+1);
        //     else
        //         hm2.put(c,1);
        // }


        // for(int i=0;i<t.length();i++)
        // {
        //     char c = t.charAt(i);

        //     if(hm.containsKey(c) && hm2.containsKey(c))
        //     {
        //         if(hm.get(c).equals(hm2.get(c)))
        //             continue;
        //         else
        //             return false;
        //     }
        //     else
        //         return false;

        // }

        return true;

    }
}
