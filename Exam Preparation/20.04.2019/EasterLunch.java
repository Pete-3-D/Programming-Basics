import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nKozunaci = Integer.parseInt(scan.nextLine());
        int nEggs = Integer.parseInt(scan.nextLine());
        int kgKurabii = Integer.parseInt(scan.nextLine());

        double total = 0;

        total += nKozunaci * 3.20;
        total += nEggs * 4.35;
        total += kgKurabii * 5.40;
        total += nEggs * 12 * 0.15;

        System.out.printf("%.2f\n", total);
    }
}
