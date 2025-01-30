package stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

public class Main {

    public static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp=stack.pop();
            sortStack(stack);
            insertSort(stack, temp);
        }
    }

    public static void insertSort(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
        }else {
            int temp=stack.pop();
            insertSort(stack, element);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(7);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
}
