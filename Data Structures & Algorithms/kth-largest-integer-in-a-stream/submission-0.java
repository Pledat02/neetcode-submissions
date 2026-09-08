class KthLargest {
    List<Integer> list = new ArrayList<>();;
    int k;
    public KthLargest(int k, int[] nums) {
     for (int num : nums) {
            this.list.add(num);
        }
       this.k=k;
    }
    
    public int add(int val) {
        list.add(val);
      list.sort(Collections.reverseOrder());
        return list.get(k-1);
    }
}
