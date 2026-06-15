class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        char[] set = s.toCharArray();
        for (char c : set){
            if (map.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == map.get(c)) stack.pop();
                else return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
