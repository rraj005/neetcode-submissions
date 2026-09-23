class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        parse(n, sb, res, 0, 0);
        return res;
    }

    public void parse(int n, StringBuilder sb, List<String> res, int lp, int rp){
        if (sb.length() == (2 * n)){
            res.add(sb.toString());
            return;
        }
        if (lp < n){
            sb.append('(');
            parse(n, sb, res, lp + 1, rp);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rp < lp){
            sb.append(')');
            parse(n, sb, res, lp, rp + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
