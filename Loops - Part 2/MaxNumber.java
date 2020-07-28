import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int i = 0;

        while (i < n) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > max)
                max = num;
            i++;
        }

        System.out.println(max);

    }
}
