import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int lengthOfStay = Integer.parseInt(scan.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50 * lengthOfStay;
            priceApartment = 65 * lengthOfStay;
            if (lengthOfStay > 7 && lengthOfStay <= 14) {
                priceStudio = priceStudio - (priceStudio * 0.05);
            } else if (lengthOfStay > 14) {
                priceStudio = priceStudio - (priceStudio * 0.3);
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20 * lengthOfStay;
            priceApartment = 68.70 * lengthOfStay;
            if (lengthOfStay > 14) {
                priceStudio = priceStudio - (priceStudio * 0.2);
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76 * lengthOfStay;
            priceApartment = 77 * lengthOfStay;
            if (lengthOfStay > 14) {
                priceApartment = priceApartment - (priceApartment * 0.1);
            }
        }

        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
