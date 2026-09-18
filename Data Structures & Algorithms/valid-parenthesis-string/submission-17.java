class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> lp = new Stack<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(') lp.push(i);
            else if (ch == '*') st.push(i);
            else if (ch == ')'){
                if (!lp.isEmpty()) lp.pop();
                else if (!st.isEmpty()) st.pop();
                else return false;
            }
        }
        int limit = Math.min(lp.size(), st.size());
        for (int i = 0; i < limit; i++){
            if (lp.peek() > st.peek()) return false;
            else{lp.pop(); st.pop();}
        }
        return lp.isEmpty();
    }
}
