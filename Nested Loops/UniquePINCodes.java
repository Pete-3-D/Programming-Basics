import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= firstNum ; i++) {
            for (int j = 2; j <= secondNum; j++) {
                for (int k = 1; k <= thirdNum ; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            System.out.printf("%d %d %d\n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}
