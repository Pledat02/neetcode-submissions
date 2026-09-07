class Solution {
    public boolean isPalindrome(String s) {
        String raw = s.trim().toLowerCase() ;
        char[] cArr = raw.toCharArray();
        Deque<Character> linkedList = new LinkedList();
        for (int i = 0 ; i<cArr.length;i++){
            if(Character.isLetter(cArr[i]) || Character.isDigit(cArr[i])){
                linkedList.add(cArr[i]);
            }
        }
        while(linkedList.size()>1){
            if(linkedList.pollFirst()!=linkedList.pollLast()){
                return false;
            }
        }
        return true;
    }
}
