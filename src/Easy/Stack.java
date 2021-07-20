// implement a stack
package Easy;

public class Stack {
    public int[] size;
    public int capacity;
    public int top=0;

    public Stack(int capacity) {
        this.capacity = capacity;
        size = new int[capacity];

    }

    public void push(int data){
        if(top == capacity) {
            System.out.println("Stack is Full");
        }
        else {
            size[top] = data;
            top++;
            System.out.println("Element pushed to stack:" +data);
        }
    }

    public int peek(){
        if(top == 0) {
            System.out.println("Stack is empty, no top element");
            return -1;
        }
            System.out.println(size[top-1]);
        return size[top-1];
    }

    public void pop(){
        if(top == 0)
            System.out.println("Stack is empty, no pop done");
        else {
            int data = size[top-1];
            top--;
            System.out.println("Removed Element: "+data);
        }
    }

    public void printStack(){
        for (int i = top-1; i >= 0 ; i--){
            System.out.println(size[i]);
        }
    }


    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        stack1.printStack();
        System.out.println("Peak is"+stack1.peek());
        stack1.pop();

        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        stack1.push(5);

        //stack1.printStack();

        //stack1.peek();

        stack1.pop();
        stack1.printStack();

    }
}
