import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());

        int cakeSize = length * width;

        String command = "";

        while (cakeSize > 0) {
            command = scan.nextLine();

            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakeSize);
                return;
            } else {
                int piecesTaken = Integer.parseInt(command);
                cakeSize -= piecesTaken;

                if (cakeSize <= 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
                    return;
                }
            }
        }
    }
}
