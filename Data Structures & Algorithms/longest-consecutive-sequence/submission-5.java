class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int n : nums) {
            if (!uniqueNums.contains(n)) {
                uniqueNums.add(n);
            }
        }

        int longest = 0;
        for (int n : uniqueNums) {
            if (!uniqueNums.contains(n - 1)) {
                int length = 0;
                while (uniqueNums.contains(n + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
