class Solution {
    public void moveZeroes(int[] nums) {
        int currentPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[currentPosition];
                nums[currentPosition] = nums[i];
                nums[i] = temp;
                currentPosition++;
            }
        }
    }
}