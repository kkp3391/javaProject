package object2;

public class Member2 {

	
	private String Membername;
	private String MemberID;
	private String password;
	private int age;
	public String getMembername() {
		return Membername;
	}
	public void setMembername(String membername) {
		Membername = membername;
	}
	public String getMemberID() {
		return MemberID;
	}
	public void setMemberID(String memberID) {
		MemberID = memberID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public static void main(String[] args) {
	Member user1 = new Member("홍길동", "hong");
	Member user2 = new Member("강자바", "java");
	
	
}
}
