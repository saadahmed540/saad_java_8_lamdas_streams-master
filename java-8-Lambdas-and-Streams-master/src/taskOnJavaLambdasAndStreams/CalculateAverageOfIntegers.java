package taskOnJavaLambdasAndStreams;

import java.util.List;
import java.util.OptionalDouble;

public class CalculateAverageOfIntegers {
	 Double averageOfIntegers(List<Integer> list) { //method that returns the average of a list of integers
		OptionalDouble average = list.stream()
				.mapToInt(value -> value)
				.average();
		return average.isPresent() ? average.getAsDouble() : null;
		
	}
}
