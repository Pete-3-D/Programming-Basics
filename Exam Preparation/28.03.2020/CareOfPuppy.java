import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int foodQuantity = Integer.parseInt(scan.nextLine());
        int foodEaten = 0;
        String input = "";


        foodQuantity = foodQuantity * 1000;

        while (true) {
            input = scan.nextLine();

            if (input.equals("Adopted")) {
                break;
            }

            foodEaten = Integer.parseInt(input);
            foodQuantity -= foodEaten;
        }

        if (foodQuantity >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.\n", foodQuantity);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.\n", Math.abs(foodQuantity));
        }
    }
}
