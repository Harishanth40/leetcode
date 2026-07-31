class Solution {
    public String restoreString(String s, int[] indices) {
        char[] w = new char[s.length()];
        for(int i=0;i<s.length();i++){
            w[indices[i]] = s.charAt(i);
        }
        return new String(w);
    }
}
