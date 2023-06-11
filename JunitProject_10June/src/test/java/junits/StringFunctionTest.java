package junits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringFunctionTest {
//	@Test
//	public void Test() {
//		boolean result = StringFunction.isPalindrome("ABCba");
//		Assertions.assertEquals(result,true);
//	}
	
	@Test
	@DisplayName("Positive Test Scenario")
	public void Test1() {
		
		Assertions.assertTrue(StringFunction.ispallindrom("MOM"));
	}
	@Test
	public void Test2() {
		
		Assertions.assertFalse(StringFunction.ispallindrom("MOMz"));
	}
	@Test
	public void Test3() {
		
		Assertions.assertTrue(StringFunction.ispallindrom("Dad"));
	}
}
