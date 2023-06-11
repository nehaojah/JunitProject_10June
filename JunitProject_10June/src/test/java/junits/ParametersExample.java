package junits;

import java.time.Month;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	
//	@ParameterizedTest
//	@ValueSource(strings= {"mom","dad","radar"})
//	public void PalindromeCheck(String str) {
//		
//		Assertions.assertTrue(StringFunction.isPalindrome(str));
//			
//	}
//	
//	@ParameterizedTest
//	@ValueSource(ints= {2,4,6,8})
//	public void EvenNumCheck(int num) {
//		
//		Assertions.assertTrue(num%2==0);
//			
//	}
//	@ParameterizedTest
//	@EnumSource(Month.class)
//	public void MonthCheck(Month monthname) {
//		
//		//System.out.println(monthname.name() + " " + monthname.length(false));
//		
//		Assertions.assertTrue(monthname.length(false)==30 || monthname.length(false)==31 || monthname.length(true)==29);	
//	}
	
	
	@ParameterizedTest
	@MethodSource("DataProvider")
	public void PalindromeCheck1(String str) {
		
		Assertions.assertTrue(StringFunction.isPalindrome(str));
			
	}
	
//	static Stream<String> DataProvider(){
//		
//		return Stream.of("racecar", "radar", "mom", "dad");
//		
//	}
	
static List<String> DataProvider(){
		
		return List.of("racecar", "radar", "mom", "dad");
		
	}
}
