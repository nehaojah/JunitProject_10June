package junits;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitAssertions {

	@Test
	public void test1() {
		

		String str1= "Simplilearn";
		String str2 = "Simplilearn";
		String str3 = "Oxford";
		
		Assertions.assertEquals(str1, str2);
		Assertions.assertNotEquals(str1, str3);
		
		String str4 = null;
		Assertions.assertNull(str4);
		Assertions.assertNotNull(str1);
		
		String[] arr1 = {"abc","xyz","pqr"};
		String[] arr2 = {"abc","xyz","pqr"};
		Assertions.assertArrayEquals(arr1, arr2);
		
		int i=10;
		int j=6;
		Assertions.assertTrue(i>j);
		Assertions.assertFalse(j<0);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Neha");
		list1.add("sadiq");
		list1.add("durga");
		
		Assertions.assertEquals(3, list1.size());
		


		
	}


}
