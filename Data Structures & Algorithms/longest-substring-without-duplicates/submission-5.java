class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int result = 0;

        int l = 0;
        
        for (int r = 0; r < s.length(); r++) {
            while (characters.contains(s.charAt(r))) {
                characters.remove(s.charAt(l));
                l++;
            }

            characters.add(s.charAt(r));
            result = Math.max(result, (r - l) + 1);
        }

        return result;
    }
}
