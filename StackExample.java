package Stack;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//Declare a stack
		Stack<Integer>stack = new Stack<>();
		//Store 10 elements into the stack 
		for(int i=1;i<=10;i++) {
			stack.push(i);
		}
		//Display the stack after adding element
		System.out.println("Stack after pushing 10 elements:"+stack);
		//Remove 4 elememts from the stack
		for(int i=0;i<4;i++) {
			stack.pop();
		}
		//Display the stack after removing 4 elements 
		System.out.println("Stack after popping 4 elements:"+stack);
		
	}

}
