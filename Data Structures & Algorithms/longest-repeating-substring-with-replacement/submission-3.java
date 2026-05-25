class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!letters.contains(c)) {
                letters.add(c);
            }
        }

        for (char c : letters) {
            int count = 0;
            int i = 0;
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    count++;
                }

                while ((j - i + 1) - count > k) {
                    if (s.charAt(i) == c) {
                        count--;
                    }
                    i++;
                }

                res = Math.max(res, (j - i + 1));
            }
        }

        return res;
    }
}
