package test.project.build.maven.java;

/**
 * Hello world!
 *
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main( String[] args ) {
        InetAddress ip;
        String hostname;

        try {
            System.out.println( "Hello World!" );

            // Get IP address
            ip = InetAddress.getLocalHost();
            System.out.println("Your current IP address : " + ip);

            // Get Hostname
            hostname = ip.getHostName();
            System.out.println("Hostname: " +  hostname);
        }
        
        catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}


