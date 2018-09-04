package Data_Structures.Stack;

public class Stack {
	private int stackSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.stackSize = size;
		this.stackArray = new char[this.stackSize];
		this.top = -1;
	}
	
	public void push(char element) {
		top++;
		this.stackArray[top] = element;
	}
	
	public char pop() {
		int old_top = top;
		top--;
		return this.stackArray[old_top];
	}
	
	public char peak() {
		return this.stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == this.stackSize-1;
	}
}
