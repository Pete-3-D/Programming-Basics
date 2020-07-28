import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nFloors = Integer.parseInt(scan.nextLine());
        int nRooms = Integer.parseInt(scan.nextLine());

        for (int i = nFloors; i > 0 ; i--) {
            if (i == nFloors) {
                for (int j = 0; j < nRooms; j++) {
                    System.out.printf("L%d%d ", i, j);
                }
                System.out.println();
                continue;
            } else if (i % 2 == 0) {
                for (int j = 0; j < nRooms; j++) {
                    System.out.printf("O%d%d ", i, j);
                }
                System.out.println();
                continue;
            } else if (i % 2 == 1) {
                for (int j = 0; j < nRooms; j++) {
                    System.out.printf("A%d%d ", i, j);
                }
                System.out.println();
                continue;
            }
        }
    }
}
