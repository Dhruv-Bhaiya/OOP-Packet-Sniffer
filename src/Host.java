import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Host extends Thread {
    private static final int PORT = 9098;
    private static final int DEST_PORT = 9091;
    private static final String DEST_IP = "127.0.0.1";

    void send(int num) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);
        for (int i = 0; i < num; i++) { //sending "num" number of packets
            String pack;
            if (i == num - 1) //last packet
                pack = "quit...";
            else
                pack = PacketGenerator.StringGenerator();

            //Making packet appropriate to send
            DatagramPacket packet = new DatagramPacket(pack.getBytes(), pack.getBytes().length, InetAddress.getByName(DEST_IP), DEST_PORT);
            socket.send(packet);
        }
        socket.close();
    }
}
