import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        double area = length * width * height;
        double liters = area / 1000;
        percentage *= 0.01;
        liters *= (1 - percentage);

        System.out.printf("%.3f", liters);
    }
}
