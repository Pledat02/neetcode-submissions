class Solution {
    public int maxProfit(int[] prices) {
        int max =Integer.MIN_VALUE;
        for(int i = 0 ;i< prices.length-1;i++){
            System.out.println(max);
             for(int j = i+1 ;j< prices.length;j++){
                int value =prices[j]-prices[i];
                if(value>max){
                    max=value;
                }
             }
        }
        return (max>0)?max:0;
    }
}
