class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> countT = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = countT.size();
        int res[] = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && countT.get(c) == window.get(c)) {
                have++;
            }

            while (have == need) {
                if ((j - i) + 1 < resLen) {
                    resLen = (j - i) + 1;
                    res[0] = i;
                    res[1] = j;
                }

                char cLeft = s.charAt(i);
                window.put(cLeft, window.get(cLeft) - 1);
                if (countT.containsKey(cLeft) && window.get(cLeft) < countT.get(cLeft)) {
                    have--;
                }
                i++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
