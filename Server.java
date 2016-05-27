import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server{
	static Scanner sc;
	static ServerSocket ssocket;
	static InputValidator inputValidate;
	static Calculator calculator;
	
	public static void main(String[] args){
		sc = new Scanner(System.in);
		inputValidate = new CalculatorInputValidator();
		
		//Get input first
		String input = getCalculatorFromServer(inputValidate);
		
		if(input.equals("1"))
			calculator = new FlamesCalculator();
		else
			calculator = new TrueLoveCalculator();
		
		try{
			ssocket = new ServerSocket(9000);
			System.out.println("Server Listening..." );
			
			while(true){
				Socket s = ssocket.accept();
				ServerThread st = new ServerThread(s, calculator);
				st.start();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	//print 
	public static String getCalculatorFromServer(InputValidator inputValidate){
		System.out.println("Choose a calculator");
		System.out.println("(1) Flames Calculator");
		System.out.println("(2) True Love Calculator");
		System.out.print("Enter number: ");
		
		String input = sc.nextLine();
		if(inputValidate.checkInput(input)==false)
			return ("1");

		return input;
	}
	
}
