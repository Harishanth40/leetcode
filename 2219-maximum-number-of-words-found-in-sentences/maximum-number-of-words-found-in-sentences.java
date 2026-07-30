class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i=0;i<sentences.length;i++){
            String[] a=sentences[i].split(" ");
            if(a.length>count){
                count=a.length;
            }
        }
        return count;
    }
}