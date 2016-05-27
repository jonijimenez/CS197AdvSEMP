import static org.junit.Assert.*;

import org.junit.Test;

public class TrueLoveCalculatorTest {

	Calculator trueLoveCalc = new TrueLoveCalculator();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(true);
	}
	
	@Test
	public void testNoMatchingLetters(){
		String percent = trueLoveCalc.getResults("Abcd", "Fghi");
		assertEquals("0 percent",percent);
	}
	
	
	@Test
	public void testString() {
		String percent = trueLoveCalc.getResults("Sarah", "Tyler");
		assertEquals("42 percent",percent);
	}
	
	@Test
	public void testFirstNameLongerThan10() {
		String percent = trueLoveCalc.getResults("TTTTTTTTTT", "LLLLL");
		assertEquals("105 percent",percent);
	}
	
	@Test
	public void testString3() {
		String percent = trueLoveCalc.getResults("T", "L");
		assertEquals("11 percent",percent);
	}
	
	@Test
	public void testString4() {
		String percent = trueLoveCalc.getResults("nick wilde", "judy hopps");
		assertEquals("23 percent",percent);
	}

	@Test
	public void testSecondNameLongerThan10() {
		String percent = trueLoveCalc.getResults("tt", "lllllooooovvveee");
		assertEquals("516 percent",percent);
	}
	
}
