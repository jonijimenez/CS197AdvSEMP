
public class CalculatorInputValidator implements InputValidator {

	public boolean checkInput(String input){
		return checkCalculator(input);
	}
	
	
	public boolean checkCalculator(String input){
		if(input.equals("1") || input.equals("2"))
			return true;
		
		return false;
					
	}


}
