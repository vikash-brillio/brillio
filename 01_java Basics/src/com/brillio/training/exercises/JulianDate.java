package com.brillio.training.exercises;

//import java.util.Date;

public class JulianDate {

	public static void main(String[] args) {
		int day = 20, month = 1, year = 1974;
		int numOfDays = validateDate(day, month, year);
		//System.out.println("days="+numOfDays);
		System.out.println(numOfDays);

	}

	public static int validateDate(int d, int m, int y) {

		if (m > 12)
			return -2;
		else if (y <= 0)
			return -1;
		else {
			int days = DaysInMonthAndYear.countDays(m, y);
			if (d>days || d<0) return -3;
			else 
				{
				
				return totalDays(d,m,y);
				
				}
		}
	}

	
//	public static int getTotaldays(int d, int m, int y) {
//		@SuppressWarnings("deprecation")
//		Date newDate= new Date(y, m, d);
//		@SuppressWarnings("deprecation")
//		Date oldDate=new Date(1900, 1, 1);
//        int diffInDays = (int) ((newDate.getTime() - oldDate.getTime()) / (1000 * 60 * 60 * 24));
//		//System.out.println(newDate.getTime() - oldDate.getTime());
//        return diffInDays;
//	}
	
	public static int totalDays(int d,int m,int y)
	{
		
		double  t_years=y-1900;
		double days=t_years * 365.25;
		int days2=0;
		for(int i=1;i<m;i++)
		{
			days2=days2+DaysInMonthAndYear.countDays(i, y);
		}
		int totalDays=days2+d+(int)days;
		//System.out.println("total exact Date="+days2+ "  "+days);
		return totalDays;
	}
}
