package ingeritances;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "white";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		cp.getClass();
		cp.toString();
		System.out.println("============================");
		
		
		DmbCellPhone dp = new DmbCellPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel  = 29;
		dp.powerOn();
		dp.bell();
		dp.powerOff();
		dp.turnOnDmb();
		dp.turnOffDmb();
		System.out.println("============================");
		
		
		SmartPhone sp = new SmartPhone();
		sp.model = "LGphone";
		sp.color = "Pink";
		sp.commonMethod();
		System.out.println("============================");
		
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
		
	
		
	}

}
