package Data_Structures.Stack;

public class App {

	public static void main(String[] args) {
		Stack myStack = new Stack(10);
		myStack.push('H');
		myStack.push('E');
		myStack.push('L');
		myStack.push('L');
		myStack.push('O');

		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
