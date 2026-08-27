class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>> result = new HashMap();
        for(int i=0; i<strs.length;i++){
            char[] cArray = strs[i].toCharArray();
            int[] counts = new int[26];
            for(char c : cArray){
                counts[c-'a']++;
            }
            String key = Arrays.toString(counts);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
                result.get(key).add(strs[i]);

        }
        return new ArrayList<>(result.values());

    }
}
