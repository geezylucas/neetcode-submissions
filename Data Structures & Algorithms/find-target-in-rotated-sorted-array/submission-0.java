class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int middle = i + (j - i) / 2;

            if (nums[middle] > nums[j]) {
                i = middle + 1;
            } else {
                j = middle;
            }
        }
        
        int pivot = i;
        int result = binarySearch(nums, target, 0, pivot -1);
        if (result != -1) {
            return result;
        }

        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    public int binarySearch(int nums[], int target, int i, int j) {
        while (i <= j) {
            int middle = i + (j - i) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }

        return -1;
    }
}
