class Solution {
    public boolean isPalindrome(String s) {
        char[] sSanitized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int i = 0;
        int j = sSanitized.length - 1;
        while (i < j) {
            if (sSanitized[i] != sSanitized[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
