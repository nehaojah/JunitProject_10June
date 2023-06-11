package junits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
@Test
@Tag("Sanity")
@Tag( "Regression")
public void Test() {
	int result = Calculator.add(6, 7);
	Assertions.assertEquals(result,13);

}
@Test
@Tag("Sanity")
public void test2() {
	
	int result = Calculator.sub(10,6);
	Assertions.assertEquals(4,result);
}

}
