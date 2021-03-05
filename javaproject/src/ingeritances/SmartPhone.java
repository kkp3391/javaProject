package ingeritances;

public class SmartPhone extends DmbCellPhone {

	@Override
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다.");
		}

		@Override
		void powerOff() {
			System.out.println("DmbPhone 전원을 끕니다.");
	
}
}