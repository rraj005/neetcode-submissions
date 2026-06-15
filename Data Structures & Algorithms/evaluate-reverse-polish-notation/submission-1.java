class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens){
            try{
                int x = Integer.parseInt(i);
                stack.push(x);
            }
            catch (Exception e){
                int x1 = stack.pop();
                int x2 = stack.pop();
                switch (i){
                    case "-" : stack.push(x2 - x1);
                    break;
                    case "+" : stack.push(x2 + x1);
                    break;
                    case "*" : stack.push(x2 * x1);
                    break;
                    case "/" : stack.push(x2 / x1);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
