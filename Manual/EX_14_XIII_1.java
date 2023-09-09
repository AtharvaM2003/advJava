package Manual;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EX_14_XIII_1 {

	public static void main(String[] args) {
		System.out.println("Enter Host Name:");
		Scanner input=new Scanner(System.in);
		String host=input.nextLine();
		try {
			InetAddress ip=InetAddress.getByName(host);
			System.out.println("IP Address of "+host+" is "+ip);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
