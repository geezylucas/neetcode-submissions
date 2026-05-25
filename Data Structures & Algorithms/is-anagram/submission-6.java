class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sFrequency = new int[26];
        int[] tFrequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sFrequency[s.charAt(i) - 'a']++;
            tFrequency[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sFrequency[i] != tFrequency[i]) {
                return false;
            }
        }

        return true;
    }
}
