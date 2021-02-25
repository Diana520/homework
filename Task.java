package lesson34;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
	public static void main(String[] args) {
	String word = "hello hello my name is Dodo my dog is lucky";
	String[] words = word.split(" ");
	 Stream.of(words)
     .map(String::toLowerCase)
     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
     .entrySet()
     .stream()
     .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
     .map(Map.Entry::getKey)
     .forEach(System.out::println);
	}

}
