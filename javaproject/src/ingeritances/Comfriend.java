package ingeritances;

public class Comfriend extends Friend {

	String department;
	public Comfriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}
	@Override
	public String toString() {
		return "Comfriend [department=" + department + ", name=" + getName() + ", phone=" + getPhone() + "]";
	}
	
	
}
