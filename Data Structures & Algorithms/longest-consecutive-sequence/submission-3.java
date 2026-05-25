class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setNums = new HashSet<>();

        for (int n : nums) {
            setNums.add(n);
        }

        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = 1;
            if (!setNums.contains(nums[i] - 1)) {
                while (setNums.contains(nums[i] + j)) {
                    j++;
                }

                maxCount = Math.max(maxCount, j);
            }
        }

        return maxCount;
    }
}
