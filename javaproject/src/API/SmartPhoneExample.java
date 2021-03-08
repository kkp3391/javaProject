package API;

public class SmartPhoneExample { //객체의 문자정보(toString()메소드)

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);

	}

}
