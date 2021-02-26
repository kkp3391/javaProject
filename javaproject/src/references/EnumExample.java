package references;

import java.util.Calendar;
enum Kind {
	MALE, FEMALE;
}
enum choice{
	YES, NO;
}
public class EnumExample {
	public static void main(String[] args) {
		int maleOrFemale = 1;
		int YesORNo = 1;
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 "+cal.get(Calendar.YEAR));
		System.out.println("월" + cal.get(Calendar.MONTH));
		System.out.println("일" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일" + cal.get(Calendar.DAY_OF_WEEK));
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY;break;
		case 2:
			today = Week.MONDAY;break;
		case 3:
			today = Week.TUESDAY;break;
		case 4:
			today = Week.WEDNESDAY;break;
		case 5:
			today = Week.THURSDAY;break;
		case 6:
			today = Week.FRIDAY;break;
		case 7:
			today = Week.SATURDAY;break;
		
		}
		System.out.println("오늘 요일: " + today);
		
		//if(today == Week.SUNDAY) {
		if (week == 1 || week ==2) {	
		System.out.println("오늘이 금요일이었으면 이틀 쉴텐데...");
		} else {
			System.out.println("집가고싶다");
		}
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남성입니다");
		}else if (manOfWoman == Kind.FEMALE) {
			System.out.println("여성입니다");
		}
	}
}
