import static java.lang.Math.sqrt;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class AntTester {

	public static void main(String[] args) {
		int k = (int) random(100);
		for (int i = 0; i<sqrt(k);i++) {
			if (i<5) System.out.println("branch-b commit");
		}
	}
	public int product(int factor1, int factor2) {
		return factor1 * factor2;
	}

}
