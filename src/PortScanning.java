import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PortScanning {
    String sniff(DatagramPacket packet, DatagramSocket socket) { //extracting packet information
        int Src_Port = packet.getPort();
        InetAddress ip = packet.getAddress();
        String Src_Address = ip.getHostAddress();
        System.out.println("SOURCE ADDRESS:-");
        System.out.println(Src_Port + "\t" + Src_Address);
        System.out.println("DESTINATION ADDRESS:-");
        InetAddress destination = socket.getInetAddress();
        System.out.println(socket.getLocalPort() + "\t");
        String packet_data = new String(packet.getData());
        System.out.println(packet_data + "\n");
        return packet_data;
    }
}
