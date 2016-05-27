
public class NamesInputValidator implements InputValidator{
	
	public boolean checkInput(String input){
		return checkNames(input);
	}
	
	public boolean checkNames(String input){
		if(input.matches("[A-Za-z\\s]+,[A-Za-z\\s]+"))
				return true;
		return false;
		
		
		//String[] inputs = input.split(",");
		//if(inputs.length == 2)
		//	return true;
		
		//return false;
		
	}
}
