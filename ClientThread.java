import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientThread {
	
	public static InputValidator inputValidate;
	public static Scanner scanner;
	
	public static void main(String[] args){
		try{
			inputValidate = new NamesInputValidator();
			scanner = new Scanner(System.in);
			
			System.out.println("Client tries to connect...");
		
			String ip = getServerIPAddress();
			
			Socket socket = new Socket(ip,9000);
			Connection conn = new Connection(socket);
			
			System.out.println("Client connected!");
			
			ClientGUI cGui = new ClientGUI(conn);
			cGui.getInput(inputValidate); 
			
		}
		catch(Exception e){
			System.out.println("Client: Soemthing bad happened");
			e.printStackTrace();
		}
		
		
	}
	
	public static String getServerIPAddress(){
		System.out.println("Enter Server IP Address");
		return scanner.nextLine();
	}
	
}
