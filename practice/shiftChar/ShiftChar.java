// By: Prahlad Panthi
// right shift characters in a string by n times

package problem;

import java.util.Scanner;

class ShiftChar{
	
	private static String rightShift(String input, int n){
		int len = input.length();
		char[] ans = new char[len];
		for(int i = 0; i < len; i++)
			ans[(i+n)%len] = input.charAt(i);
		return new String(ans);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = sc.next();
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		String ans = rightShift(input, n);
		System.out.println("Result: "+ans);
		sc.close();
	}
}
