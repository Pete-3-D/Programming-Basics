import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nBees = Integer.parseInt(scan.nextLine());
        int health = Integer.parseInt(scan.nextLine());
        int attack = Integer.parseInt(scan.nextLine());

        while (true) {
            nBees -= attack;

            if (nBees < 100) {
                System.out.printf("The bear stole the honey! ");

                if (nBees < 0) {
                    nBees = 0;
                }

                break;
            }

            health -= nBees * 5;

            if (health <= 0) {
                System.out.printf("Beehive won! ");
                break;
            }
        }

        System.out.printf("Bees left %d.\n", nBees);
    }
}
