package generics;


// 수업과정
public class Course <T> {
	private String courseName;
	private T[] students;
	public Course(String courseName, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}
	
	public String getName() {return name;}
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i]=t;
				break;
			}
		}
	}
	
	}

	
