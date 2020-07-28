import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nBitcoin = Double.parseDouble(scan.nextLine());
        double nYuan = Double.parseDouble(scan.nextLine());
        double commission = Integer.parseInt(scan.nextLine());

        double total = 0;

        nBitcoin = nBitcoin * 1168; // bitcoin to lv
        nBitcoin = nBitcoin / 1.95; // lv to eur

        nYuan = nYuan * 0.15; // yuan to $
        nYuan = nYuan * 1.76; // $ to lv
        nYuan = nYuan / 1.95; //lv to eur

        total = nBitcoin + nYuan;
        total = total - (total * commission / 100);
        System.out.printf("%.2f", total);
    }
}
