import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char c;
        int value = 0;

        for (int i = 0; i < input.length(); i ++) {
            c = input.charAt(i);
            switch (c) {
                case 'a':
                    value += 1;
                    break;
                case 'e':
                    value += 2;
                    break;
                case 'i':
                    value += 3;
                    break;
                case 'o':
                    value += 4;
                    break;
                case 'u':
                    value += 5;
                    break;
                default:
                    break;
            }
        }

        System.out.println(value);
    }
}
