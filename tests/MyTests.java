import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
public class MyTests {
	
    @Test
    public void testProductWithZero() {
		AntTester tester = new AntTester();
		
		//test to pass
		assertEquals(0, tester.product(10, 0));
	}
	
    @Test
    public void testString() {
		AntTester tester = new AntTester();
		
		//test to fail
		assertEquals("0", null);
	}
	
	@Test
	public void testError() {
		int k = 0;
		assertEquals(4/k, 4);
	}
	
	@Ignore
	@Test
	public void testSkip() {
		assertEquals("", null);
	}
}