import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nOfDogs = Integer.parseInt(scan.nextLine());
        int nOfAnimals = Integer.parseInt(scan.nextLine());

        double costOfFood = nOfDogs * 2.50 + nOfAnimals * 4;

        System.out.printf("%.2f lv.", costOfFood);
    }
}
