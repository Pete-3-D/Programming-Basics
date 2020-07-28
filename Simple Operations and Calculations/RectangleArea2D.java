import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double height = Math.abs(y2 - y1);
        double length = Math.abs(x2 - x1);

        double area = height * length;
        double perimeter = 2 * height + 2 * length;

        System.out.printf("%.2f\n", area);
        System.out.printf("%.2f", perimeter);


    }
}
