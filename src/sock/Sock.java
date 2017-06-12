package sock;

import java.net.Socket;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Sock {
	
	private void trans() throws Exception {
		//ServerSocket SS = new ServerSocket(5000);
		Socket sc = new Socket("localhost", 5000);
		PrintStream PS = new PrintStream(sc.getOutputStream());
		PS.println("Hello Server");
		
		BufferedReader BF = new BufferedReader(new InputStreamReader(sc.getInputStream()));
		System.out.println(BF.readLine());
		
		/*sc.close();
		PS.close();
		BF.close();*/
		
	}
	
	public static void main (String[]args) throws Exception{
		Sock sc = new Sock();
		sc.trans();
	}

}
