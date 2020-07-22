package taskOnJavaLambdasAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class listOfThreeLetterStrings {
	List<String> filterThreeLetterStrings(List<String> list) { //method that returns a list of all strings that start with 
		//the letter 'a' (lower case) and have exactly 3 letters.
		return list.stream()
				.filter(str -> str.startsWith("a"))
				.filter(str -> str.length()==3)
				.collect(Collectors.toList());
		
	}
}
