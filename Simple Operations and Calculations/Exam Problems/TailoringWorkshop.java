import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nOfTables = Integer.parseInt(scan.nextLine());
        double lengthOfTables = Double.parseDouble(scan.nextLine());
        double widthOfTables = Double.parseDouble(scan.nextLine());

        double areaTablecloth = (lengthOfTables + 0.60) * (widthOfTables + 0.60);
        double areaSquare = (lengthOfTables / 2) * (lengthOfTables / 2);

        double priceUSD = nOfTables * (areaTablecloth * 7 + areaSquare * 9);
        double priceBGN = priceUSD * 1.85;

        System.out.printf("%.2f USD\n", priceUSD);
        System.out.printf("%.2f BGN", priceBGN);
    }
}

