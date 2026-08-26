class Solution {
    public boolean hasDuplicate(int[] nums) {
         int n = nums.length; int i=0;int j=1;
        while(n>1){
            if(nums[i]==nums[j]){
                return true;
            }
            if(j==nums.length-1){
                n--;
                i++;
                j = nums.length-n+1;
            }else{
                j++;
            }

        }
        return false;
    }
}