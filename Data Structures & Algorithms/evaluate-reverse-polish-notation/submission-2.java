class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for (String s : tokens) {
            int result;
            int a;
            int b;
            switch (s) {
                case "+":
                    a = operands.pop();
                    b = operands.pop();
                    result = a + b;
                    operands.push(result);
                break;
                case "-":
                    a = operands.pop();
                    b = operands.pop();
                    result = b - a;
                    operands.push(result);
                break;
                case "*":
                    a = operands.pop();
                    b = operands.pop();
                    result = a * b;
                    operands.push(result);
                break;
                case "/":
                    a = operands.pop();
                    b = operands.pop();
                    result = b / a;
                    operands.push(result);
                break;
                default:
                    operands.push(Integer.parseInt(s));
            }
        }

        return operands.pop();
    }
}
