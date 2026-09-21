class Solution {
    public String d[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        parse(digits, sb, res, 0);
        //res.remove(0);
        return res;
    }

    public void parse(String digits, StringBuilder sb, List<String> res, int idx){
        if (digits.length() == sb.length()){
            res.add(new StringBuilder(sb).toString());
            return;
        }
        
        for (int i = idx; i < digits.length(); i++){
            int pos = digits.charAt(i) - '0';
            for (char ch : d[pos].toCharArray()){
                sb.append(ch);
                parse(digits, sb, res, i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }
}
