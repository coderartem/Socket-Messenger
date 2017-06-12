package serv;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;

public class Serv {

	private void input () throws Exception {
		
		ServerSocket SS = new ServerSocket(5000);
		Socket SC = SS.accept();
		
		BufferedReader BF = new BufferedReader(new InputStreamReader(SC.getInputStream()));
		System.out.println(BF.readLine());
		//String str = BF.readLine();
	
	//	if (!str.equals(null)){  //почему-то через if не работает никак
			System.out.println("1");
			PrintStream PS = new PrintStream(SC.getOutputStream());
			PS.println("Got Something");
		//}
		
		/*SS.close();
		SC.close();
		BF.close();*/
			
	}
	
	public static void main (String[]args) throws Exception {
		Serv sv = new Serv();
		sv.input();
	}
}
