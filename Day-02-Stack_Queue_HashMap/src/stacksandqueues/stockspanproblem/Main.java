package stacksandqueues.stockspanproblem;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StockSpan s=new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = s.calculateSpan(prices);
        for(int i:span){
            System.out.print(i+" ");
        }
    }
}
