import java.net.*;
import java.io.*;

public class ServerThread extends Thread {
	Socket socket;
	Calculator calculator;
	
	public ServerThread(Socket socket, Calculator calculator){
		this.socket = socket;
		this.calculator = calculator;
	}
	
	public void run(){
		Connection conn;
		
		try{
			conn = new Connection(socket);
			
			String input="";
			input = conn.getMessage();
			while(input.equals("Letsendthis")==false){
				String[] inputs = input.split(",");
				String result = calculator.getResults(inputs[0], inputs[1]);
				conn.sendMessage(result);
				input = conn.getMessage();
			}
			
		}
		catch(Exception e){
			System.out.println("Server : Something happened");
			e.printStackTrace();
		}
		
		
	}
}
