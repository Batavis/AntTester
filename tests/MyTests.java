import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class MyTests {
	
    @Test
	public void testProductWithZero() {
		AntTester tester = new AntTester();
		
		//test to pass
		assertEquals(0, tester.product(10, 0));
		
	}
	 
	
}