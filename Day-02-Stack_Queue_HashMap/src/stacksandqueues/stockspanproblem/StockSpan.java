package stacksandqueues.stockspanproblem;

import java.util.Stack;

public class StockSpan {
    public int[] calculateSpan(int[] prices){
        Stack<Integer> stack=new Stack<>();
        int n=prices.length;
        int[] span=new int[n];
        for (int i=0; i<n; i++){
            while(!stack.isEmpty() && prices[stack.peek()]<=prices[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }else {
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}
