import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double under200 = 0;
        double from200to399 = 0;
        double from400to599 = 0;
        double from600to799 = 0;
        double from800 = 0;

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scan.nextLine());

            if (currentNum < 200)
                under200++;
            else if (currentNum < 400)
                from200to399++;
            else if (currentNum < 600)
                from400to599++;
            else if (currentNum < 800)
                from600to799++;
            else
                from800++;
        }

        p1 = under200 / n * 100;
        p2 = from200to399 / n * 100;
        p3 = from400to599 / n * 100;
        p4 = from600to799 / n * 100;
        p5 = from800 / n * 100;

        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");
        System.out.printf("%.2f", p4);
        System.out.println("%");
        System.out.printf("%.2f", p5);
        System.out.println("%");

    }
}
