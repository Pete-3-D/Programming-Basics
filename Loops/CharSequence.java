import java.util.Scanner;

public class CharSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char n;

        for (int i = 0; i < input.length(); i ++) {
            n = input.charAt(i);
            System.out.printf("%c\n", n);
        }
    }
}
