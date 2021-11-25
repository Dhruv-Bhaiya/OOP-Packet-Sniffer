import java.io.IOException;
import java.util.Scanner;

public class AttackingTraffic extends Host {
    void generate(int num) throws IOException {
        if (num <= 1000) { //checking if traffic generated is attacking or not
            System.out.println("Minimum number of packets is 1000 for Attacking Traffic");
            return;
        }
        send(num);
    }

    void generate() throws IOException {
        generate(1050);
    }

    public static void main(String[] args) throws IOException {
        AttackingTraffic attackingTraffic = new AttackingTraffic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of packets");
        int n = sc.nextInt();
        attackingTraffic.generate(n);
    }
}
