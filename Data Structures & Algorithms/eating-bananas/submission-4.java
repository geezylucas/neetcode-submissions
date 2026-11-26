class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = Arrays.stream(piles).max().getAsInt();
        int result = j;

        while (i < j) {
            int k = i + (j - i) / 2;

            double totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }

            if (totalTime <= h) {
                result = k;
                j = k;
            } else {
                i = k + 1;
            }
        }

        return result;
    }
}
