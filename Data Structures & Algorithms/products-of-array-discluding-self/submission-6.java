class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pre =1;
        result[0] = pre;
        for(int i  =1; i< nums.length;i++){
          result[i] = pre * nums[i-1];
          pre =  result[i];
        }
        int pos = nums[nums.length-1];
         for(int i  =nums.length-1-1; i>=0 ;i--){ 
          result[i] = pos * result[i];
          pos = pos * nums[i];  
        }

        return result;
    }
 
}  
