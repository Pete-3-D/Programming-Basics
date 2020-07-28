import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double kozunaci = guests / 3.0;
        kozunaci = Math.ceil(kozunaci);
        int eggs = guests * 2;

        double total = kozunaci * 4 + eggs * 0.45;

        if (budget >= total) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", kozunaci, eggs);
            System.out.printf("He has %.2f lv. left.\n", budget - total);
        } else {
            System.out.printf("Lyubo doesn't have enough money.\n");
            System.out.printf("He needs %.2f lv. more.\n", Math.abs(budget - total));
        }
    }
}
