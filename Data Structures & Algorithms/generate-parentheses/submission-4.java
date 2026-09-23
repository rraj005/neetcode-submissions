public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, res, stack);
        return res;
    }

    private void backtrack(int openN, int closedN, int n, List<String> r, StringBuilder sb) {
        if(openN == closedN && openN == n) {
            r.add(sb.toString());
            return;
        }

        if(openN < n) {
            sb.append("(");
            backtrack(openN + 1, closedN, n, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(closedN < openN) {
            sb.append(")");
            backtrack(openN, closedN + 1, n, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    
}