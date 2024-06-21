class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedchar = new String(chars);

            if(!map.containsKey(sortedchar)){
                map.put(sortedchar,new ArrayList<String>());
            }

            map.get(sortedchar).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}