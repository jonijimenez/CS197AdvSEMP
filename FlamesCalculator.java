import java.util.*;
public class FlamesCalculator{

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

		int count = 6;
		int k=1,deleted_letters=0;
		int j;
		for(j=0;j<=count;j++){
			if(k <= length){
				if(j == count){
					j=0;
				}
				if(flames_check[j] == true){
					k = k+1;
				}
			}
			if((k-1)==length){
				deleted_letters = deleted_letters+1;
				flames_check[j] = false;
				k = 1;
			}
			if(deleted_letters==6){
				if(j==0){
					return "FRIENDSHIP";
				}else if(j==1){
					return "LOVE";
				}else if(j==2){
					return "AFFECTION";
				}else if(j==3){
					return "MARRIAGE";
				}else if(j==4){
					return "ENEMY";
				}else if(j==5){
					return "SIBLING";
				}
					break;
			}
		}
	}
	



	
}