import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double price = 0;

        switch (type) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5;
                break;
            default:
                return;
        }

        System.out.printf("%.02f", price * r * c);

    }
}
