import static org.junit.Assert.*;

import org.junit.Test;

public class NamesInputValidatorTest {

	InputValidator inputValidate = new NamesInputValidator();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(true);
	}
	
	@Test
	public void testName(){
		boolean input = inputValidate.checkInput("Bogart");
		assertEquals(false, input);
	}
	
	@Test
	public void testTwoNames(){
		boolean input = inputValidate.checkInput("Bogart,Girly");
		assertEquals(true, input);
	}

	@Test
	public void testThreeNames(){
		boolean input = inputValidate.checkInput("Bogart,Girly,Joshua");
		assertEquals(false, input);
	}
	
	@Test
	public void testNumbers(){
		boolean input = inputValidate.checkInput("Bogart,Girly1");
		assertEquals(false, input);
	}
	
	@Test
	public void testNumbers2(){
		boolean input = inputValidate.checkInput("Romeo0,Juliet");
		assertEquals(false, input);
	}
	
	@Test
	public void testSymbols(){
		boolean input = inputValidate.checkInput("Eric,Ariel@");
		assertEquals(false, input);
	}
	
	@Test
	public void testSymbols2(){
		boolean input = inputValidate.checkInput("Philip',Aurora");
		assertEquals(false, input);
	}
	
	@Test
	public void testSpaces(){
		boolean input = inputValidate.checkInput("Natsu Dragneel,Lucy Heartphilia");
		assertEquals(true, input);
	}
	
	@Test
	public void testNames(){
		boolean input = inputValidate.checkInput("Monkey D. Luffy,Nico Robin");
		assertEquals(false, input);
	}

	@Test
	public void testSpacesOnly(){
		boolean input = inputValidate.checkInput(" , ");
		assertEquals(false, input);
	}


}
