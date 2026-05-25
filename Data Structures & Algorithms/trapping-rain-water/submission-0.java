class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int i = 0; // 3
        int j = height.length - 1; // 5
        int leftMax = height[i]; // 3
        int rightMax = height[j]; // 3
        int res = 0; // 9

        while (i < j) {
            if (leftMax < rightMax) {
                i++;
                leftMax = Math.max(leftMax, height[i]);
                res += leftMax - height[i];
            } else {
                j--;
                rightMax = Math.max(rightMax, height[j]);
                res+= rightMax - height[j];
            }
        }

        return res;
    }
}
