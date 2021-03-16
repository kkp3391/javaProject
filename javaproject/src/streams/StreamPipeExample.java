package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipeExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
			new Member("Hong", Member.MALE,30),	
			new Member("Kim", Member.FEMALE,20),
			new Member("Shin", Member.MALE,46),
			new Member("Park", Member.FEMALE,27)
			);

		OptionalDouble result = list.stream()// Stream<Member>
		.filter(new Predicate<Member>() {

			@Override
			public boolean test(Member t) {
				return t.getSex()== Member.MALE;
			}
			
		})//Stream<Member>
		.mapToInt(new ToIntFunction<Member>() {

			@Override
			public int applyAsInt(Member t) {
				return t.getAge();
			}
			
		})// IntStream
		.average()//OptionalDouble
		
		;
		System.out.println("평균: " + result.getAsDouble());
		//컬렉션-> 스트림-> 매핑(나이) -> 필터(30세이상)->평균나이 구해보세요
		
		
		OptionalDouble result1 = list.stream().mapToInt((Member t) ->t.getAge()).filter((int value) -> value >=30).average(); 
			if(result1.isPresent()) {
				System.out.println(result1.getAsDouble());
				
			} else {
				System.out.println("없음");
			}
					
					
				}
					
	
	
	
	}


