class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs.size(); i++){ 
            str.append(strs.get(i).length());
            str.append('#');
            str.append(strs.get(i));
        }
        //System.out.println(str);
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') j += 1;
            int length = Integer.parseInt(str.substring(i, j));
            lst.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return lst;
    }
}
