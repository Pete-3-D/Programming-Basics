import java.util.Scanner;

public class LettersCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char begin = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        char exception = scan.next().charAt(0);
        int count = 0;

        for (char i = begin; i <= end; i++) {
            for (char j = begin; j <= end; j++) {
                for (char k = begin; k <= end; k++) {
                    if (i != exception && j != exception && k != exception) {
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
