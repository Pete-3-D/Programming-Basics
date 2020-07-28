import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());

        double cost = area * 7.61;
        double discount = cost * 18 / 100;
        double finalPrice = cost - discount;

        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
