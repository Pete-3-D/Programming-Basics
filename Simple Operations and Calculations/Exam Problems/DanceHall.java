import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double W = Double.parseDouble(scan.nextLine());
        double L = Double.parseDouble(scan.nextLine());
        double A = Double.parseDouble(scan.nextLine());

        double areaHall = (W * 100) * (L * 100);
        double areaWardrobe = (A * 100) * (A * 100);
        double areaBench = areaHall / 10;
        areaHall = areaHall - areaBench - areaWardrobe;

        int dancers = (int) areaHall / (7000 + 40);

        System.out.printf("%d", dancers);
    }
}
