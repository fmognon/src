import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testaddTest() {
		myJunitClass junit = new myJunitClass();
		int result = junit.add(100,200);
		assertEquals(300, result);
	}

}
