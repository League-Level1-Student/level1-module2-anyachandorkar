import static org.junit.Assert.*;

import org.junit.Test;

public class FunWithTests {

	@Test
	public void test() {
		assertEquals(2, add(1, 1));
		assertEquals(5, add(1, 4));
		assertEquals(-4, add(8, -14));
		assertEquals(2, add(1, 1));
		assertEquals(2, add(1, 1));
	}
	
	int add(int x, int y) {
		return x + y;
	}

}
