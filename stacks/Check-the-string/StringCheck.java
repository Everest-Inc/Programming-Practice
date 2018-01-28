import java.util.Scanner;

public class StringCheck{
	
	private static int top = -1;
	private static char[] stack = new char[10];
	
	private static void push(char c){
		stack[++top] = c;
	} 
	
	private static void pop(){
		stack[top--] = ' ';
	}
	
	private static boolean isEmpty(){
		if(top == -1) return true;
		return false;
	}
	
	private boolean isValid(String input){
		int len = input.length();
		if(len == 0 || input.equals("ab")) return true;
		push(input.charAt(0));
		for(int i = 1; i < len; i++){
			if(input.charAt(i) == 'b' && top >= 0 && stack[top] == 'a')
				pop();
			else
				push(input.charAt(i));
		}
		if(isEmpty()) return true;
		return false;
	}
	
	public static void main(String[] args){
		StringCheck sc = new StringCheck();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(sc.isValid(input));
		scanner.close();
	}
}
