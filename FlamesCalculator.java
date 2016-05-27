import java.util.*;
public class FlamesCalculator implements Calculator{

	public static String removeSpaceAndLowerCase(String str){
		return str.replaceAll(" ", "").toLowerCase();
	}
	public String getResults(String first, String second){
		int length = first.length()+second.length();
		boolean name_check[] = new boolean[second.length()];
		for(int i=0;i<second.length();i++){
			name_check[i]=false;
		}

		for(int i=0;i<first.length();i++){
			for(int j=0;j<second.length();j++){
				if((name_check[j]==false) && (first.charAt(i) == second.charAt(j))){
					name_check[j]=true;
					length = length - 2;
					break;
				}
			}
		}

		boolean flames_check[] = new boolean[6];
		for(int i=0;i<6;i++){
			flames_check[i] = true;
		}

		int flamesCount = 6;
		int k=1,deletedLetters=0;
		int j;
		for(j=0;j<=flamesCount;j++){
			if(k <= length){
				if(j == flamesCount){
					j=0;
				}
				if(flames_check[j] == true){
					k = k+1;
				}
			}
			if((k-1)==length){
				deletedLetters = deletedLetters+1;
				flames_check[j] = false;
				k = 1;
			}
			if(deletedLetters==6){
				switch (j){
					case 0: return "FRIENDSHIP";
					case 1: return "LOVE";
					case 2: return "AFFECTION";
					case 3: return "MARRIAGE";
					case 4: return "ENEMY";
					case 5: return "SIBLING";

				}
					break;
			}
		}

		return "";
	}

}
