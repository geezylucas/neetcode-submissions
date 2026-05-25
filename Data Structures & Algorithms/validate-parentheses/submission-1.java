class Solution {
    public boolean isValid(String s) {
        Stack<Character> count = new Stack<>();
        Map<Character, Character> pars = new HashMap<>();
        pars.put(')', '(');
        pars.put('}', '{');
        pars.put(']', '[');

        for (char c : s.toCharArray()) {
            if (!pars.containsKey(c)) {
                count.push(c);
            } else {
                if (!count.isEmpty() && count.peek() == pars.get(c)) {
                    count.pop();
                } else {
                    return false;
                }
            }
        }

        return count.isEmpty();
    }
}
