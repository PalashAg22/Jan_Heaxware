package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50);
		// long count = stream.count();
		// System.out.println(count);

		Comparator<Integer> comp = (i1, i2) -> {
			return i1.toString().compareTo(i2.toString());
		};
//		Optional<Integer> opt = stream.max(comp);
//		System.out.println(opt.orElse(0));
		Consumer<Integer> consumer = System.out::println;
		stream.forEach(consumer);

		String names[] = { "satish", "ravindra kumar", "ford", "adam gilkiris", "king khan" };
		Stream<String> s2 = Arrays.stream(names);
		Function<String, Integer> fun = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}

		};
		Predicate<Integer> pre = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>8;
			}
			
		};
		s2.map(fun).filter(pre)
		.forEach(consumer);
		
		
		Stream<String> s3 = Arrays.stream(names);
	
		//int rs = s3.reduce(0,(c,e)->c+e);
	}
}
