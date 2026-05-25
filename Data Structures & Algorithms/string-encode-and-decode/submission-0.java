class Solution {

    public String encode(List<String> strs) {
        StringBuilder strEncoded = new StringBuilder();

        for (String s : strs) {
            strEncoded.append(s.length()).append("#").append(s);
        }

        return strEncoded.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < str.length()) {
            j = i;
            while ('#' != str.charAt(j)) {
                j++;
            }

            int sLength = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + sLength; 
            res.add(str.substring(i, j));
            i = j;
        }

        return res;
    }
}