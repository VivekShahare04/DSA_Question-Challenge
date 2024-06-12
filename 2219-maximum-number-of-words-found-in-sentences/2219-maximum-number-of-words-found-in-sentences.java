class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int n = sentences.length;

        for(int i=0;i<n;i++){
            max = Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
}