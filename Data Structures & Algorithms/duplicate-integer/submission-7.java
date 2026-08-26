class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> listnums = new HashSet<>();
      listnums.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        if(listnums.size()<nums.length){
            return true;
        }
        return false;
    }
}