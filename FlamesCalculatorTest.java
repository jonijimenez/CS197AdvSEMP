import static org.junit.Assert.*;

import org.junit.Test;

public class FlamesCalculatorTest {

	Calculator flamesCalc = new FlamesCalculator();

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(true);
	}

	@Test
	public void testString(){
		String relationship = flamesCalc.getResults("asd", "abcd");
		assertEquals("FRIENDSHIP",relationship);
	}
	@Test
	public void testString2() {
		String relationship = flamesCalc.getResults("Mase", "Mitzie");
		assertEquals("MARRIAGE", relationship);
	}@Test
	public void testString3() {
		String relationship = flamesCalc.getResults("Bran", "Hodor");
		assertEquals("ENEMY",relationship);
	}@Test
	public void testSameName() {
		String relationship = flamesCalc.getResults("Sarah", "Sarah");
		assertEquals("FRIENDSHIP",relationship);
	}


}
