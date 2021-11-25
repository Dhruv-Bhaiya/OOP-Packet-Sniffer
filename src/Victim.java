import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.UnknownHostException;

public class Victim extends PortScanning {
    private static final int SERVER_PORT = 9091;
    private static final String SERVER_IP = "127.0.0.1";
    static int count = 0;

    void receive() throws IOException, UnknownHostException {     //receives sent packets
        DatagramSocket socket = new DatagramSocket(SERVER_PORT);
        byte[] arr = new byte[1024];
        DatagramPacket packet = new DatagramPacket(arr, 1024);
        String str = "xxxxxxx";
        while (!str.substring(0, 7).equals("quit...")) { //checks for last packet to stop receiving
            ++count;
            if (count > 1000) { //detects if an attack is happening
                System.out.println("An attack is happening");
                break;
            }
            socket.receive(packet);
            str = sniff(packet, socket); //extracting information from the packet
        }
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Victim client = new Victim();
        client.receive();
    }

}
