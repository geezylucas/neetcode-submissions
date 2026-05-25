class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stackAux = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stackAux.isEmpty() && t > stackAux.peek()[0]) {
                int[] pair = stackAux.pop();
                res[pair[1]] = i - pair[1];
            }
            stackAux.push(new int[]{t, i});
        }

        return res;
    }
}
