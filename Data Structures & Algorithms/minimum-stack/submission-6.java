class MinStack {
   Deque<Integer> minstack;
   Deque<Integer> sortedList = new LinkedList<Integer>();
   int min = Integer.MAX_VALUE;
    public MinStack() {
        minstack = new LinkedList();
    }
    
    public void push(int val) {
        if(min>val){
            min = val;
            sortedList.push(val);
        }else{
            sortedList.push(min);
        }
         minstack.push(val);
    }
    
   public void pop() {
    minstack.pop();
    if (min == sortedList.pop()) {
        Integer newMin = sortedList.peek();
        min = (newMin != null) ? newMin : Integer.MAX_VALUE;
    }
}
    
    public int top() {
      return minstack.peek() ;
    }
    
    public int getMin() {
        return sortedList.peek() ;
    }
}
