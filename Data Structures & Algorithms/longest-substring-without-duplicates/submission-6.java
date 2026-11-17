class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int l = 0;

        Set<Character> store = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (store.contains(s.charAt(r))) {
                store.remove(s.charAt(l));
                l++;
            }

            store.add(s.charAt(r));
            result = Math.max(result, (r - l) + 1);
        }

        return result;
    }
}
