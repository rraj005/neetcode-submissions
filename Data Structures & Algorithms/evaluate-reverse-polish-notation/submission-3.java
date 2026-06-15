class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens){
            if(i.equals("-")){
                int x1 = stack.pop();
                int x2 = stack.pop();
                stack.push(x2 - x1);
            }

            else if (i.equals("+")) stack.push(stack.pop() + stack.pop());
            
            else if (i.equals("*")) stack.push(stack.pop() * stack.pop());

            else if(i.equals("/")){
                int x1 = stack.pop();
                int x2 = stack.pop();
                stack.push(x2 / x1);
            }

            else stack.push(Integer.parseInt(i));
        }
        return stack.get(0);
    }
}
