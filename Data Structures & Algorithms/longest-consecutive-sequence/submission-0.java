class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i< nums.length;i++) {
            set.add(nums[i]);
        }
        int bestLength =0;
         for (Integer x : set) {
           if(!set.contains(x-1)){
                int length =1;
                while(set.contains(x+length)){
                    length+=1;
                }
                bestLength = Math.max(length,bestLength);
           }
        }
        return bestLength;


    }
}
