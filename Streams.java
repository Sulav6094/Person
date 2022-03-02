package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		// creating a basic stream
		List<Integer> nums = new ArrayList<>();
		Stream<Integer> numStream = nums.stream();

		// making a list with data in it
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		numbers.stream()
//		.forEach(x-> System.out.println(x));
		// mapMethod
		List<Integer> mapNums = Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 9);
		List<Integer> expression = mapNums.stream().map(x -> 2 * x + 3).collect(Collectors.toList());
		List<Integer> revorderdNums = mapNums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(expression);
//		System.out.println(revorderdNums);
		// Filter
		List<String> names = Arrays.asList("Michael", "Sarah", "James", "Bob");
		List<String> result = names.stream().filter(str -> !str.equals("James")).map(str -> "Hello " + str)
				.collect(Collectors.toList());
		System.out.println(result);

		List<Integer> ints = Arrays.asList(3, 4, 7, 8, 12);
		int answer = ints.stream().reduce((a, b) -> a * b).get();
		System.out.println(answer);

		int ansmax = ints.stream().mapToInt(x -> x).max().getAsInt();
		int ansmin = ints.stream().mapToInt(x -> x).min().getAsInt();
		List<Integer> evenints = ints.stream().filter(str -> str % 2 == 0).collect(Collectors.toList());
		List<Integer> oddints = ints.stream().filter(str -> str % 2 == 1).collect(Collectors.toList());
		int sum = ints.stream().reduce((a, b) -> a + b).get();
		int ansminafter = ints.stream().mapToInt(x -> x * x).filter(str -> str % 2 == 1).min().getAsInt();
		System.out.println(sum);
		System.out.println(evenints);
		System.out.println(oddints);
		System.out.println(ansmax);
		System.out.println(ansmin);
		System.out.println("minafter:" + ansminafter);

	}

}
