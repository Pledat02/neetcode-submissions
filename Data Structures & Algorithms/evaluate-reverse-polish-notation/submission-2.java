class Solution {
    public int evalRPN(String[] tokens) {
       
        Deque<Integer> list = new ArrayDeque<>();

        for(int i =0; i< tokens.length;i++){

        try {  
            int n = Integer.parseInt(tokens[i]);
            list.addFirst(n);  
            

        } catch(NumberFormatException e){  

                int a = list.pop();
                int b = list.pop();
        int rs =0;

                    if(tokens[i].equals("+")) {
                    rs = a + b;
                    }else  if(tokens[i].equals("-")) {
                    rs = b - a;
                    }else  if(tokens[i].equals("*")) {
                        rs = a * b;
                    }else  if(tokens[i].equals("/")) {
                        rs = b / a;
                    }
                    list.addFirst(rs);
        }  

        }
        return list.pop();
        
    }
   
}
