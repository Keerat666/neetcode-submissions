class Solution {

    public String encode(List<String> strs) {

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<strs.size();i++)
        {
            String word = strs.get(i);
            ans.append(word.length());
            ans.append("#");
            ans.append(word);


        }

        return ans.toString();

    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        int i=0;

        while(i<str.length())
        {
            int j=i;

            while(str.charAt(j)!='#')
                j++;

            int wordLength = Integer.parseInt(str.substring(i,j));

            int start = j+1;

            ans.add(str.substring(start,start+wordLength));
            i=start+wordLength;
        }
        return ans;

    }
}
