package API;

public class SmartPhone { //객체의 문자정도(toString() 메소드)
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	
	}

	@Override
	public String toString() {
		
		return company+ "," + os;
	}
	
	
}
