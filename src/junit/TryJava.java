package junit;

import java.util.Arrays;
import java.util.List;

public class TryJava {
	public static void main(String[] args){
		List<Integer> intList = Arrays.asList(1,2,3);
		intList.stream().map(i -> i + 1).forEach(System.out::println);
	}
}
