class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();


        for(int i=0;i<strs.length;i++)
        {
            String str = strs[i];
            int f[]= calculateFreq(str);

            StringBuilder sb = new StringBuilder();
            for (int count : f) {
                sb.append('#').append(count);
            }
            String key = sb.toString();

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(str);
        }
        
        return new ArrayList<>(hm.values());
    }


    public static int[] calculateFreq(String s)
    {

        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            freq[c-'a']++;
        }

        return freq;
    }
}