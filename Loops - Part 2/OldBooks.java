import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String theBook = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        int i = 0;

        while (i < capacity) {
            String aBook = scan.nextLine();

            if (aBook.equals(theBook)) {
                System.out.printf("You checked %d books and found it.", i);
                return;
            } else
                i++;
        }

        System.out.printf("The book you search is not here!\n");
        System.out.printf("You checked %d books.", i);

    }
}
