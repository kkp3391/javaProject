package ingeritances;

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//생성자
/*	DmbCellPhone(String model, String color,int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}*/
	//메소드
	
	void turnOnDmb() {
		System.out.println("채널: "+channel+"방송을 수신합니다");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: "+channel+"로 변경합니다");
	}
	void turnOffDmb() {
		System.out.println("방송을 종료합니다.");
	}

	@Override
	void powerOn() {
	System.out.println("DmbPhone 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다.");
	}

	@Override
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void commonMethod() {
		System.out.println("모델:" + model + ",색상:" + color);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DmbCellPhone => model : " + model + "color :" + color + "channel" + channel;
	}
	

	
}
