class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String strdouble = s+s;
        String str = strdouble.substring(1,strdouble.length()-1);
        return str.contains(s);
    }
}