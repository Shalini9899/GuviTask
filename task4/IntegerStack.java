package task4;

import java.util.EmptyStackException;

public class IntegerStack {

	
	 private int[] stack;
	    private int top;
	    private int capacity;

	    public IntegerStack(int capacity) {
	        this.capacity = capacity;
	        stack = new int[capacity];
	        top = -1; 
	    }

	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack overflow. Cannot push element " + element);
	            return;
	        }
	        stack[++top] = element;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack[top--];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == capacity - 1;
	    }

	    public static void main(String[] args) {
	        IntegerStack stack = new IntegerStack(5);

	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        System.out.println("Popped element: " + stack.pop()); 
	        System.out.println("Popped element: " + stack.pop()); 

	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	    }
}
