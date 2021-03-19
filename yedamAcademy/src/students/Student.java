package students;

public class Student {
	  private int stdNo;
	   private String name;
	   private int age;
	   private String phone;
	   private int score;

	   public Student() {}
	   
	   public Student(int stdNo, String name, int age, String phone, int score) {
	      super();
	      this.stdNo = stdNo;
	      this.name = name;
	      this.age = age;
	      this.phone = phone;
	      this.score = score;
	   }

	   public int getstdNo() {
		      return stdNo;
		   }

		   public void setStdNo(int stdNo) {
		      this.stdNo = stdNo;
		   }

		   public String getName() {
		      return name;
		   }

		   public void setName(String name) {
		      this.name = name;
		   }

		   public int getAge() {
		      return age;
		   }

		   public void setAge(int age) {
		      this.age = age;
		   }

		   public String getPhone() {
		      return phone;
		   }

		   public void setPhone(String phone) {
		      this.phone = phone;
		   }

		   public int getScore() {
		      return score;
		   }

		   public void setScore(int score) {
		      this.score = score;
		   }
	   
	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", name=" + name + ", age=" + age + ", phone="
				+ phone + ", score=" + score + "]";
	}

	
	}

