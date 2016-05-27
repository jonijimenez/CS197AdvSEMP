import java.net.*;
import java.io.*;

public class Connection {
	Socket socket;
	
	public Connection(Socket socket){
		this.socket = socket;
	}
	
	
	public boolean sendMessage(String msg){
		try{
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter out = new PrintWriter(osw);
			
			out.println(msg);
			out.flush();
		}
		catch(Exception e){
			System.out.println("Connection: Something bad happened");
			e.printStackTrace();
			return false;
		}
		return true;
	} 
	
	public String getMessage(){
		
		String msg = "";
		try{
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			
			msg = in.readLine();
		}
		catch(Exception e){
			System.out.println("Connection: Something bad happened");
			e.printStackTrace();
		}
		
		return msg;
	}
	
	public void close(){
		try{
			socket.close();
		}
		catch(IOException e){
			System.out.println("Connection: Error");
			e.printStackTrace();
		}
	}
}
