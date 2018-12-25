package test.project.build.maven.java;

/**
 * Hello world!
 *
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main( String[] args ) { 
        try {
            System.out.println( "Hello World!" );    

            // Get IP address
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Your current IP address : " + ip);

            // Get Hostname
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println("Hostname: " +  myHost.getHostName());
        }

        catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }   
}

