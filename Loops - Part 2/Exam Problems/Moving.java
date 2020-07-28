import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String s = "";
        int space = width * length * height;

        while (!s.equals("Done")) {
            s = scan.nextLine();

            if (s.equals("Done")) {
                break;
            } else {
                int num = Integer.parseInt(s);
                space -= num;

                if (space <= 0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
                    return;
                }

            }
        }

        System.out.printf("%d Cubic meters left.", space);
    }
}
