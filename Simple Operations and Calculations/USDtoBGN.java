import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputUSD = Double.parseDouble(scan.nextLine());

        double lev = inputUSD * 1.79549;
        System.out.printf("%.2f", lev);
    }
}
