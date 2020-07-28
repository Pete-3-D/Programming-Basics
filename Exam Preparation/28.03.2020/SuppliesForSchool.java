import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        double whiteboardCleaner = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double total = 0;
        total += pens * 5.80;
        total += markers * 7.20;
        total += whiteboardCleaner * 1.20;

        total = total - (total * discount / 100);

        System.out.printf("%.3f", total);
    }
}
