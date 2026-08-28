class Solution {

    public String encode(List<String> strs) {
      String str = "";
        for(String s : strs ){
            str += s.length()+"."+s;
        }
          System.out.print(str);

        return str;
    }

    public List<String> decode(String str) {
        List<String> rs = new ArrayList();
        for(int i = 0; i < str.length(); ){
            int slashIndex = str.indexOf('.', i);
            int len = Integer.parseInt(str.substring(i, slashIndex));
            i = slashIndex + 1;
            rs.add(str.substring(i, i + len));
            i += len;
        }
         return rs;
    }
}
