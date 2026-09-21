class Solution {
    public List<List<String>> partition(String s) {
        List<String> path = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        parse(s, 0, 0, path, res);
        return res;
    }

    public void parse(String s, int i, int j, List<String> path, List<List<String>> res){
        if (i == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        while (i <= j && j < s.length()){
            if (isPalindrome(s, i, j)){
                path.add(s.substring(i, j + 1));
                parse(s, j + 1, j + 1, path, res);
                path.removeLast();
            }
            j++;
        }
    } 

    public boolean isPalindrome(String s, int i, int j){
        while (i <= j && j < s.length()){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
