import java.io.IOException;
import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        char lastSector = temp.charAt(0);
        int startRows = Integer.parseInt(scan.nextLine());
        int seatsOddRow = Integer.parseInt(scan.nextLine());

        int seatsRow = seatsOddRow;
        int consequentSectorRows = startRows;
        int count = 0;


        for (char i = 'A'; i <= lastSector ; i++) {
            for (int j = 1; j <=  consequentSectorRows; j++) {
                if (j % 2 == 0)
                    seatsRow = seatsOddRow + 2;
                else
                    seatsRow = seatsOddRow;
                for (char k = 'a'; k < 'a' + seatsRow; k++) {
                    System.out.printf("%c%d%c\n", i, j, k);
                    count++;
                }
            }
            consequentSectorRows++;
        }

        System.out.println(count);
    }
}
