import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int i = 1; i < n; i++) {
            for (int i2 = 1; i2 < n; i2++) {
                for (int i3 = 97; i3 < 97 + l; i3++) {
                    for (int i4 = 97; i4 < 97 + l; i4++) {
                        int max = Integer.max(i, i2) + 1;
                        for (int i5 = max; i5 <= n; i5++) {
                            System.out.printf("%d%d%c%c%d ", i, i2, (char)i3, (char)i4, i5);
                        }
                    }
                }
            }
        }
    }
}
