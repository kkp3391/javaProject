package ingeritances;

public class CellPhoneEx2 {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp = (CellPhone) new DmbCellPhone(); //int = (int) byte;
		//cp = (CellPhone) new SmartPhone();
		cp.color = "";
		
		
		if(cp instanceof DmbCellPhone) {
		DmbCellPhone dp = (DmbCellPhone) cp;
		dp.model = "";
		dp.color = "";
		dp.channel = 15;
		dp.powerOn();
		
		} else {
			System.out.println("Casting 안댐");
		
		//다형성
		//부모= 자식들
		//부모.메소드=자식.메소드
		cp = new DmbCellPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
		
		
		}
		
	}

}
