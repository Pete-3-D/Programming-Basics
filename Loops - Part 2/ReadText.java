import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "";

        while (!s.equals("Stop")) {
            s = scan.nextLine();
        }
    }
}
