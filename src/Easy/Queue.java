// Implement a queue using 2 stacks
package Easy;

import java.util.Stack;

public class Queue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        int x;
        if (stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty.");
            System.exit(0);
        }
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        //System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
