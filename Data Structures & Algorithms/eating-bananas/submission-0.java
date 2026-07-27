class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = Arrays.stream(piles).max().getAsInt();
        int res = j;

        while (i <= j) {
            int k = i + (j - i) / 2;

            double totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }

            if (totalTime <= h) {
                res = k;
                j = k - 1;
            } else {
                i = k + 1;
            }
        }

        return res;
    }
}
