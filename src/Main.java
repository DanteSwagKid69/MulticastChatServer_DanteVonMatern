import java.io.IOException;
import java.net.MulticastSocket;

public class Main {
    public static void main(String[] args) throws IOException {


        // Default port number we are going to use
        int portNumber = 500;
        if (args.length >= 1) {
            portNumber = Integer.parseInt(args[0]);
        }

        // Create a MulticastSocket
        MulticastSocket serverMulticast = new MulticastSocket(portNumber);
        System.out.println("MulticastSocket is created at port " + portNumber);

        // Determine the IP adress of host, given the host name
    }

}