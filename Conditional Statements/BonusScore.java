import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialPoints = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;

        if (initialPoints <= 100){
            bonusPoints = 5;
        } else if (initialPoints > 100 && initialPoints <= 1000) {
            bonusPoints = initialPoints * 0.2;
        } else if (initialPoints > 1000) {
            bonusPoints = initialPoints * 0.1;
        }

        if (initialPoints % 2 == 0) {
            bonusPoints += 1;
        } else if (initialPoints % 10 == 5) {
            bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + initialPoints);
    }
}
