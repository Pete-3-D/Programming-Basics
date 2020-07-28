import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double num = 0;

        for (int i = 0; i <= n; i += 2) {
            num = Math.pow(2, i);
            System.out.printf("%.0f\n", num);
        }
    }
}
