package com.example.prahl.zodiac;

/**
 * Created by prahl on 1/21/2018.
 */

public class Zodiac {
    //private int year, month, day;
    public final Integer[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final Integer[] LEAP_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(Integer year){
        if(!(year%4 == 0))
            return false;
        else if(!(year%100 == 0))
            return true;
        else if(!(year%400 == 0))
            return false;
        return true;
    }

    public boolean isValid(Integer year, Integer month, Integer day){
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

    public String findMyZodiac(Integer year, Integer month, Integer day){
        boolean valid = isValid(year, month, day);
        if(!valid){
            return "Invalid";
        }
        else{
            if((month == 3 && day >= 21) || (month == 4 && day <= 19))
                return "Aries";
            else if((month == 4 && day >= 20) || (month == 5 && day <= 20))
                return "Taurus";
            else if((month == 5 && day >= 21) || (month == 6 && day <= 20))
                return "Gemini";
            else if((month == 6 && day >= 21) || (month == 7 && day <= 22))
                return "Cancer";
            else if((month == 7 && day >= 23) || (month == 8 && day <= 22))
                return "Leo";
            else if((month == 8 && day >= 23) || (month == 9 && day <= 22))
                return "Virgo";
            else if((month == 9 && day >= 23) || (month == 10 && day <= 22))
                return "Libra";
            else if((month == 10 && day >= 23) || (month == 11 && day <= 21))
                return "Scorpio";
            else if((month == 11 && day >= 22) || (month == 12 && day <= 21))
                return "Sagittarius";
            else if((month == 12 && day >= 22) || (month == 1 && day <= 19))
                return "Capricon";
            else if((month == 1 && day >= 20) || (month == 2 && day <= 18))
                return "Aquarius";
            else
                return "Pisces";
        }

    }
}
