package stacksandqueues.implementaqueueusingstacks;

import java.util.Stack;

// Create queue using stacks
public class QueueUsingStacks {
    Stack<Integer> stack1, stack2;

    // constructor to assign stacks
    public QueueUsingStacks(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    // enqueue operation
    public void enqueue(int data){
        stack1.push(data);
    }

    // dequeue operation
    public int dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

//    peek operation
    public int peek(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

//    check isEmpty
    public boolean isEmpty(){
        return stack1.isEmpty() || stack2.isEmpty();
    }
}
