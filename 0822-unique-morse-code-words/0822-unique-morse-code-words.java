class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for(char c:word.toCharArray())
                sb.append(morse[c-'a']);
            set.add(sb.toString());
        }

        return set.size();
    }
}