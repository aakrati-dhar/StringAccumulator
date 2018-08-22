package StringAccumulator.Calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringAccumulatorJunit {

	@Test
	public void test() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("");
		assertEquals(0, result);
	}

	@Test
	public void test1() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("1");
		assertEquals(1, result);
	}
	@Test
	public void test2() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("1,2");
		assertEquals(3, result);
	}
	@Test
	public void test3() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test
	public void test4() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("//;\n1;2");
		assertEquals(3, result);
	}
	@Test
	public void test5() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("//***\n1***2***3");
		assertEquals(6, result);
	}
	
	@Test
	public void test6() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("//***\n1***2***3");
		assertEquals(6, result);
	}
	@Test
	public void test7() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("//*|%\n1*2%3");
		assertEquals(6, result);
	}
	@Test
	public void test8() {
		StringAccumulator test = new StringAccumulator();
		int result = test.add("//1\n1*20,1001");
		assertEquals(22, result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void test9() {
		StringAccumulator test = new StringAccumulator();
		test.add("//1\n1$-3,4*-2");		
	}
	
	
}
