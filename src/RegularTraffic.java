import java.io.IOException;
import java.util.Scanner;

public class RegularTraffic extends Host {
    void generate(int num) throws IOException {
        if (num > 1000) {
            System.out.println("Packet Limit(1000) Exceeded for Regular Traffic");
            return;
        }
        send(num);
    }

    void generate() throws IOException {
        generate(5);
    }

    public static void main(String[] args) throws IOException {
        RegularTraffic regularTraffic = new RegularTraffic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of packets");
        int n = sc.nextInt();
        regularTraffic.generate(n);
    }
};
