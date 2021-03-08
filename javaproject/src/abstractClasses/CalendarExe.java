package abstractClasses;

import java.util.Calendar;

public class CalendarExe {

	public static void main(String[] args) {
		//달력만들기
	
		showCal(2021,7);
	}
	
	public static void showCal(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2021,4,1); 
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		for( int i = 1; i < firstDay; i++) {
			
		}
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
//		System.out.println();
		System.out.println("__________________________");
		//cal 변수 값=> 2021년 5월 1일
//	
		
		for(int i=0; i<=firstDay; i++) {
			
			System.out.printf("%3s", "");
//			System.out.println();
		}
		
		for(int i=0; i <lastDate; i++) {
			System.out.printf("%3d", i);
			if(i%7==1) {
				System.out.println();
			
			
		}
		}		
		
		
		
//    1  2  3  4  5  6  7 		
//	  8  9 10 11 12 13 14	
//	 15 16 17 18 19 20 21	
//	 22 23 24 25 26 27 28 	
//	 29 30 31	
//
	}

}
