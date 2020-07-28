import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());
        int count = 0;
        char symbol1 = 35;
        char symbol2 = 64;

        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                System.out.printf("%c%c%d%d%c%c|", symbol1, symbol2, k, l, symbol2, symbol1);
                count++;
                if (count == max)
                    return;
                symbol1++;
                symbol2++;
                if (symbol1 > 55)
                    symbol1 = 35;
                if (symbol2 > 96)
                    symbol2 = 64;
            }
        }
    }
}

