//Write a Java function with 2 arguments representing month and year to return the number of days in the
//given month and year. If the month is invalid return -1 and if the year is invalid (year<=0) return -2

package com.brillio.training.exercises;

public class DaysInMonthAndYear {
	public static void main(String[] args) {
		int days=2,month=2013;
		int chk=checkValidation(days,month);
		if(chk==1)
		{
			int total_days=countDays(days,month);
			System.out.println(""+total_days);
		}
	}

	public static int countDays(int m, int y) {
		if (m == 4 || m == 6 || m == 9 || m == 11)

			return  30;

			else 

			if (m == 2) 

			return (((y%400==0) || (y % 100!=0) && (y%4==0)) ? 29 : 28);

			else 

			return 31;
		
	}

	public static int checkValidation(int m,int y) {
		if(m>12) 
			return -1;
		else
			if(y<0) return -2;
			else
			{
				return 1;
			}
		
		
	}

}
