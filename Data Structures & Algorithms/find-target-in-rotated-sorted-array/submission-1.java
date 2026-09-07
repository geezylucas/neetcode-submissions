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
        i = 0;
        j = nums.length - 1;
        if (target >= nums[pivot] && target <= nums[j]) {
            i = pivot;
        } else {
            j = pivot - 1;
        }

        return binarySearch(nums, target, i, j);
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
