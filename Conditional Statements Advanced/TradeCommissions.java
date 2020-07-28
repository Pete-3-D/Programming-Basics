import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commission = 0;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500)
                    commission = 0.05;
                else if (sales > 500 && sales <= 1000)
                    commission = 0.07;
                else if (sales > 1000 && sales <= 10000)
                    commission = 0.08;
                else if (sales > 10000)
                    commission = 0.12;
                else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500)
                    commission = 0.045;
                else if (sales > 500 && sales <= 1000)
                    commission = 0.075;
                else if (sales > 1000 && sales <= 10000)
                    commission = 0.1;
                else if (sales > 10000)
                    commission = 0.13;
                else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500)
                    commission = 0.055;
                else if (sales > 500 && sales <= 1000)
                    commission = 0.08;
                else if (sales > 1000 && sales <= 10000)
                    commission = 0.12;
                else if (sales > 10000)
                    commission = 0.145;
                else {
                    System.out.println("error");
                    return;
                }
                break;
            default:
                System.out.println("error");
                return;
        }

        System.out.printf("%.02f", sales * commission);
    }
}
