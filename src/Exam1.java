import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nBees = Integer.parseInt(scan.nextLine());
        int nFlowers = Integer.parseInt(scan.nextLine());

        double honey = nBees * nFlowers * 0.21;

        System.out.printf("%.0f honeycombs filled.\n", Math.floor(honey / 100));
        System.out.printf("%.2f grams of honey left.\n", honey % 100);
    }
}
