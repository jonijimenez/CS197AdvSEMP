
public class TrueLoveCalculator implements Calculator{
	
	String[] trueString = {"t","r","u","e"};
	String[] loveString = {"l","o","v","e"};
	
	public String getResults(String first, String second){
		return Integer.toString(getPercentage(first, second)) + " percent";
	}
	
	public int getPercentage(String first, String second){
		
		first = removeSpaceAndLowerCase(first);
		second = removeSpaceAndLowerCase(second);
		
		int truecount = numberOfOccurencesOfStrings(trueString,first) +
							numberOfOccurencesOfStrings(trueString,second);
		int lovecount = numberOfOccurencesOfStrings(loveString,first) +
				numberOfOccurencesOfStrings(loveString,second);
		
		int i = Integer.parseInt(Integer.toString(truecount) + 
					Integer.toString(lovecount));
		
		return i;
	}
	
	public String removeSpaceAndLowerCase(String str){
		return str.replaceAll(" ", "").toLowerCase();		
	}

	public int numberOfOccurencesOfStrings(String[] stringArray, String string){
		int n = stringArray.length;
		int count = 0;
		for(int i=0; i<n; i++){
			count += string.length() - string.replaceAll(stringArray[i], "").length();
		}
		return count;
	}
	
	
}
