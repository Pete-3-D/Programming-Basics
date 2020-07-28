import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        if (b > 7)
            b = 7;

        for (int i = 1; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                for (int k = 1; k <= c ; k++) {
                    if (i % 2 == 0 && k % 2 == 0)
                        if (j == 2 || j == 3 || j == 5 || j == 7)
                            System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
}
