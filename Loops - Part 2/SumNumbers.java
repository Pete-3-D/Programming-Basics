import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int sum = 0;

        while (!s.equals("Stop")) {
            sum += Integer.parseInt(s);
            s = scan.nextLine();
        }

        System.out.printf("%d", sum);
    }
}
