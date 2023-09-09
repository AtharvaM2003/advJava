package Manual;
import java.net.*;
public class EX_15_XIII_1
{
public static void main(String args[]) throws MalformedURLException
{
URL hp = new URL("http://www.msbte.org.in");
System.out.println("Protocol: " + hp.getProtocol());
System.out.println("Port: " + hp.getPort());
System.out.println("Host: " + hp.getHost());
System.out.println("File: " + hp.getFile());
System.out.println("Ext:" + hp.toExternalForm());
}
}