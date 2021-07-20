// create a min function that always returns the minimum value of the stack
// Operations 4,3,2,1,5,7
package Easy;

import java.util.Stack;
//Implemented using 1 stack
/*
public class MinStack {
    Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {
        int min = val;
        if (!s.isEmpty())
            min = Math.min(val,getMin());
        s.add(val);
        s.add(min);
    }

    public void pop() {
        s.pop();
        s.pop();
    }

    public int top() {
        int min = s.pop();
        int top = s.peek();
        s.add(min);
        return top;
    }

    public int getMin() {
        return s.peek();
    }

    public static void main(String[] args) {

    }
}


 */



// MinStack using 2 stacks

public class MinStack {
    Stack<Integer> stackMain;
    Stack<Integer> stackMin;

    public MinStack() {
        stackMain = new Stack<>();
        stackMin  = new Stack<>();
    }

    public void push(int val) {
        int min = val;
        if (!stackMain.isEmpty())
            min = Math.min(val,getMin());
        stackMain.add(val);
        stackMin.add(min);
    }

    public void pop() {
        stackMain.pop();
        stackMin.pop();
    }

    public int top() {
        return stackMain.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(4);
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.push(3);
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.push(5);
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.push(2);
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.push(6);
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.pop();
        System.out.println("Min value at this time: "+ minStack.getMin());
        minStack.pop();
        System.out.println("Min value at this time: "+ minStack.getMin());

    }
}






/*
    ***************************************************
    class MinStack {

    ArrayList<Integer> list = new ArrayList<>();

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return list.stream().min(Integer::compare).get();
    }
}
 */
