package stacksandqueues.implementaqueueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue=new QueueUsingStacks();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(6);
        queue.enqueue(8);
        System.out.println("peek is: "+queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
