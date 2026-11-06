class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> countS = new HashMap<>();
        int res = 0;
        int l = 0;
        int maxF = 0;
        
        for (int r = 0; r < s.length(); r++) {
            countS.put(s.charAt(r), countS.getOrDefault(s.charAt(r), 0) + 1);

            maxF = Math.max(maxF, countS.get(s.charAt(r)));

            while ((r - l + 1) - maxF > k) {
                countS.put(s.charAt(l), countS.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, (r - l + 1));
        }

        return res;
    }
}
