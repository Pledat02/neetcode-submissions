class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length() != t.length() ){
            return false;
          }

        String[] sStrings = s.split("");
        String[] tStrings = t.split("");
      
        HashMap<String,Integer> sHashMap = new HashMap<>();
       for (int i=0;i<sStrings.length;i++){
            String str= sStrings[i];
            if(sHashMap.containsKey(str)){
                sHashMap.put(str,sHashMap.get(str)+1);
            }else{
                sHashMap.put(str,1);
            }
        }
         HashMap<String,Integer> tHashMap = new HashMap<>();
        for (int i=0;i<tStrings.length;i++){
             String str= tStrings[i];
            if(tHashMap.containsKey(str)){
                tHashMap.put(str,tHashMap.get(str)+1);
            }else{
                tHashMap.put(str,1);
            }
        }
        if(sHashMap.equals(tHashMap)){
            return true;
        }
        return false;
    }
}
