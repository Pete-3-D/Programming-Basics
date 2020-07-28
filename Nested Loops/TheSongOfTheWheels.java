import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int controlValue = Integer.parseInt(scan.nextLine());
        int count = 0;
        String magicNumber = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (((i * j) + (k * l)) == controlValue) {
                            if (i < j) {
                                if (k > l) {
                                    System.out.printf("%d%d%d%d ", i, j, k, l);
                                    count++;
                                    if (count == 4) {
                                        magicNumber = "" + i + j + k + l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (count >= 4) {
            System.out.printf("\nPassword: %s", magicNumber);
        } else
            System.out.printf("\nNo!");
    }
}
