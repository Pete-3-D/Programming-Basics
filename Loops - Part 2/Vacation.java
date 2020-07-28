import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        double actionableMoney = 0;
        int count = 0;
        int i = 0;

        while (true) {
            String action = scan.nextLine();
            actionableMoney = Double.parseDouble(scan.nextLine());
            i++;

            if (action.equals("spend")) {
                count++;
                money -= actionableMoney;

                if (money < 0)
                    money = 0;
            } else if (action.equals("save")) {
                money += actionableMoney;
                count = 0;

                if (money >= neededMoney) {
                    System.out.printf("You saved the money for %d days.", i);
                    return;
                }
            }

            if (count == 5) {
                System.out.println("You can't save the money.");
                System.out.println(i);
                return;
            }
        }
    }
}
