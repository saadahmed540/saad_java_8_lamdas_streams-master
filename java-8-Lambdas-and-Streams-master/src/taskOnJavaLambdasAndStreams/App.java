package taskOnJavaLambdasAndStreams;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//Objects creation for respective classes
		CalculateAverageOfIntegers objForAverage = new CalculateAverageOfIntegers();
		listOfThreeLetterStrings objForFilterStrings = new listOfThreeLetterStrings();
		PalindromicStrings objForPalindromicFilter = new PalindromicStrings();
		//Initialization of lists
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,12,34);
		List<String>  strlist = Arrays.asList("hai","air","james","Awe","retro");
		List<String>  anotherstrlist = Arrays.asList("james","Malayalam","aja","HELoo","MADAM");
		//Declaring variables to store the output of the called methods
		Double avg;
		List<String> filteredStrings,palindromicStings;
		//Getting output from respective methods
		avg = objForAverage.averageOfIntegers(list);
		filteredStrings = objForFilterStrings.filterThreeLetterStrings(strlist);
		palindromicStings = objForPalindromicFilter.filterPalindromes(anotherstrlist);
		//Printing the output
		System.out.println("-+-------------------------------------------------------+-");
		System.out.println("Average of the given list :"+avg);
		System.out.println("-+-------------------------------------------------------+-");
		System.out.println("Filtered Strings :");
		filteredStrings.forEach(System.out::println);
		System.out.println("-+-------------------------------------------------------+-");
		System.out.println("Palindromic strings in the given list :");
		palindromicStings.forEach(val -> System.out.print(val+'\t'));
	}
}
