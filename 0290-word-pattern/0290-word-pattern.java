class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }

        HashMap<Character,Integer> charmap = new HashMap<>();
        HashMap<String,Integer> strmap = new HashMap<>();

        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];

            Integer charIndex = charmap.put(c,i);
            Integer wordIndex = strmap.put(word,i);

            if(!Objects.equals(charIndex,wordIndex)){
                return false;
            }
        }
        return true;
    }
}