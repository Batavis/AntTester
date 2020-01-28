import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.net.URL;
import java.net.URLClassLoader;
public class MyTests {
	
	public static void main(String[] args) {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
	}
    @Test
	public void testProductWithZero() {
		AntTester tester = new AntTester();
		
		//test to pass
		assertEquals(0, tester.product(10, 0));
		
		//test to fail
		//assertEquals(0, tester.product8(10,10));
	}
	
	
}