import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        int i = 0;

        while (i < n) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < min)
                min = num;
            i++;
        }

        System.out.println(min);
    }
}