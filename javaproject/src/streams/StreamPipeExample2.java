package streams;

import java.util.Arrays;
import java.util.List;

public class StreamPipeExample2 {
	public static void main(String[] args) {
	List<Member> members = Arrays.asList(//
			new Member("Hong", Member.MALE,30),	
			new Member("Kim", Member.FEMALE,20),
			new Member("Shin", Member.MALE,46),
			new Member("Hong", Member.MALE,36),
			new Member("Hong", Member.FEMALE,30),
			new Member("Hong", Member.MALE,30),
			new Member("Park", Member.FEMALE,27)
			);
	
	List<String> names = Arrays.asList("Hong", "Hwang", "Hong");
	
	members.stream()//
			.distinct()//
			.forEach(System.out::println);
	
	}
}
