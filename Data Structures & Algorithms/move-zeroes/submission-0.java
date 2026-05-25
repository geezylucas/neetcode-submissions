class Solution {
    public void moveZeroes(int[] nums) {
        int currentPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentPosition] = nums[i];
                currentPosition++;
            }
        }

        while (currentPosition < nums.length) {
            nums[currentPosition] = 0;
            currentPosition++;
        }
    }
}