// By: Prahlad Panthi

import java.util.Scanner;

public class BracketValidity{
	
	private static int top = -1;
	private static char[] stack = new char[20];
	
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
	
	private boolean isValid(String str){
		char ch;
		int len = str.length();
		if(len == 1) return false;
		int i = 1;
		push(str.charAt(0));
		boolean valid = true;
		while(valid && i < len){
			switch(ch = str.charAt(i)){
				case '[': case '(': case '{':
					push(ch);
					break;
			
				case ']':
					if(top >= 0 && stack[top] == '[')
						pop();
					else
						valid = false;
					break;
				case '}':
					if(top >= 0 && stack[top] == '{')
						pop();
					else
						valid = false;
					break;
				case ')':
					if(top >= 0 && stack[top] == '(')
						pop();
					else 
						valid = false;
					break;
				default: 
					valid = false;
					break;
			}
			i += 1;
		}
		return valid;
	}
	
	public static void main(String[] args){
		BracketValidity bv = new BracketValidity();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		boolean valid = bv.isValid(str);
		if(valid) 
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
	}
}
