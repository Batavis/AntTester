import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class Tests2 {
	@Test
	public void testMainClass() {
		assertEquals(4, new AntTester().product(2,2));
	}
	
	@Test
	public void testFailure() {
		assertEquals(1, "1");
	}
}