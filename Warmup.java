package labCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

public class Warmup
{

	public static void main(String[] args)
	{

		List<Integer> numbers = new ArrayList<>();
		for (int i = 2; i <= 51; i += 2)
		{
			numbers.add(i);
		}

		System.out.println("Numbers:");
		numbers.forEach(el -> System.out.print(el + " "));
		System.out.println();
		System.out.println("Removing multiples of three:");
		numbers.removeIf(e -> (e % 6 == 0));
		numbers.forEach(el -> System.out.print(el + " "));

	}

}
