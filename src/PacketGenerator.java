import java.util.Random;

public class PacketGenerator {
    private final static String sampleSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; //input characters
    private final static int length = 7;

    public static String StringGenerator() { //generates packets in the form of random strings
        Random rand = new Random();
        StringBuffer packet = new StringBuffer(10);
        for (int i = 0; i < length; i++) {
            packet.append(sampleSet.charAt(rand.nextInt(sampleSet.length())));
        }
        return packet.toString();
    }
}
