import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();

        String guess = "";

        while (!guess.equals(password)) {
            guess = scan.nextLine();

            if (guess.equals(password))
                System.out.printf("Welcome %s!", username);
        }
    }
}
