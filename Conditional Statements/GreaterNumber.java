import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        if (first > second)
            System.out.println(first);
        else
            System.out.println(second);
    }
}
