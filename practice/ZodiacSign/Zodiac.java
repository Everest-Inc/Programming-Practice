// By: Prahlad Panthi
// find my zodiac

package problem;

import java.util.Scanner;

public class Zodiac{
	
	private int year, month, day;
	private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private void getDate(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the DOB as DD MM YYYY: ");
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		sc.close();
	}
	
	private boolean isLeapYear(int year){
		if(!(year%4 == 0))
			return false;
		else if(!(year%100 == 0))
			return true;
		else if(!(year%400 == 0))
			return false;
		return true;
	}
	
	private boolean isValid(int year, int month, int day){
		if(year <= 0 || month > 12 || month <= 0 || day <= 0)
			return false;
		if(isLeapYear(year)){
			if(LEAP_DAYS[month-1] < day)
				return false;
		}
		if(DAYS[month-1] < day)
			return false;
		return true;
	}
	
	private void findMyZodiac(){
		getDate();
		boolean valid = isValid(year, month, day);
		if(!valid){
			System.out.println("Invalid Date!");
			return;
		}
		else{
			if((month == 3 && day >= 21) || (month == 4 && day <= 19))
				System.out.println("Aries");
			else if((month == 4 && day >= 20) || (month == 5 && day <= 20))
				System.out.println("Taurus");
			else if((month == 5 && day >= 21) || (month == 6 && day <= 20))
				System.out.println("Gemini");
			else if((month == 6 && day >= 21) || (month == 7 && day <= 22))
				System.out.println("Cancer");
			else if((month == 7 && day >= 23) || (month == 8 && day <= 22))
				System.out.println("Leo");
			else if((month == 8 && day >= 23) || (month == 9 && day <= 22))
				System.out.println("Virgo");
			else if((month == 9 && day >= 23) || (month == 10 && day <= 22))
				System.out.println("Libra");
			else if((month == 10 && day >= 23) || (month == 11 && day <= 21))
				System.out.println("Scorpio");
			else if((month == 11 && day >= 22) || (month == 12 && day <= 21))
				System.out.println("Sagittarius");
			else if((month == 12 && day >= 22) || (month == 1 && day <= 19))
				System.out.println("Capricon");
			else if((month == 1 && day >= 20) || (month == 2 && day <= 18))
				System.out.println("Aquarius");
			else
				System.out.println("Pisces");	
		}
		
	}
	
	public static void main(String[] args){
		Zodiac zodiac = new Zodiac();
		zodiac.findMyZodiac();
	}
}
