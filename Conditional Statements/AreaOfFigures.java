import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = side * side;
        }
        else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        }
        else if (figure.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            area = radius * radius * Math.PI;
        }
        else if (figure.equals("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b / 2;
        }

        System.out.printf("%.3f", area);
    }
}
