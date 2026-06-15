class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        char[] temp = s.toCharArray();
        for (char c : temp) if (Character.isLetterOrDigit(c)) sb1.append(c);
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();
        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.toString().equalsIgnoreCase(sb2.toString());
    }
}
