import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        //savings();
        //summerShopping();
        //cruiseShip();
        //cruiseGames();
        //darts();
        //cookingCompetition();
    }

    public static void cookingCompetition() {
        Scanner scan = new Scanner(System.in);
        int nParticipants = Integer.parseInt(scan.nextLine());
        String participantName = "";
        String pastryType = "";
        int pastryQuantity = 0;

        int totalPastry = 0;
        double totalSum = 0, price = 0;

        int nCookies = 0, nCakes = 0, nWaffles = 0;

        for (int i = 1; i <= nParticipants; i++) {
            participantName = scan.nextLine();

            while (true) {
                pastryType = scan.nextLine();

                if (pastryType.equals("Stop baking!")) {
                    break;
                }

                pastryQuantity = Integer.parseInt(scan.nextLine());

                if (pastryType.equals("cookies")) {
                    price = 1.50;
                    nCookies += pastryQuantity;
                }

                if (pastryType.equals("cakes")) {
                    price = 7.80;
                    nCakes += pastryQuantity;
                }

                if (pastryType.equals("waffles")) {
                    price = 2.30;
                    nWaffles += pastryQuantity;
                }

                totalSum += price * pastryQuantity;
                totalPastry += pastryQuantity;
            }

            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.\n", participantName, nCookies, nCakes, nWaffles);
            nCakes = 0;
            nCookies = 0;
            nWaffles = 0;
        }
        System.out.printf("All bakery sold: %d\n", totalPastry);
        System.out.printf("Total sum for charity: %.2f lv.\n", totalSum);

    }

    public static void darts() {
        Scanner scan = new Scanner(System.in);
        double startingPoints = Double.parseDouble(scan.nextLine());
        String sector = "";
        double points = 0;
        int moves = 1;


        while (true) {
            sector = scan.nextLine();

            if (sector.equals("bullseye")) {
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moves);
                return;
            }

            points = Double.parseDouble(scan.nextLine());

            if (sector.equals("double ring")) {
                points = points * 2;
            }

            if (sector.equals("triple ring")) {
                points = points * 3;
            }

            startingPoints -= points;

            if (startingPoints == 0) {
                System.out.printf("Congratulations! You won the game in %d moves!", moves);
                return;
            }

            if (startingPoints < 0) {
                System.out.println();
                System.out.printf("Sorry, you lost. Score difference: %.0f.", Math.abs(startingPoints));
                return;
            }

            moves++;
        }

    }

    public static void cruiseGames() {
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        int gamesPlayed = Integer.parseInt(scan.nextLine());
        String gameType = "";
        double points = 0;

        double total = 0;

        double pointsVolleyball = 0;
        double pointsTennis = 0;
        double pointsBadminton = 0;

        double gamesVolleyball = 0;
        double gamesTennis = 0;
        double gamesBadminton = 0;

        for (int i = 0; i < gamesPlayed; i++) {
            gameType = scan.nextLine();
            points = Double.parseDouble(scan.nextLine());

            if (gameType.equals("volleyball")) {
                points = points + (points * 0.07);
                pointsVolleyball += points;
                //pointsVolleyball = Math.floor(pointsVolleyball);
                gamesVolleyball++;
            }

            if (gameType.equals("tennis")) {
                points = points + (points * 0.05);
                pointsTennis += points;
                //pointsTennis = Math.floor(pointsTennis);
                gamesTennis++;
            }

            if (gameType.equals("badminton")) {
                points = points + (points * 0.02);
                pointsBadminton += points;
                //pointsBadminton = Math.floor(pointsBadminton);
                gamesBadminton++;
            }

            total += points;
        }

        total = Math.floor(total);

        boolean volleyball = pointsVolleyball / gamesVolleyball >= 75;
        boolean tennis = pointsTennis / gamesTennis >= 75;
        boolean badminton = pointsBadminton / gamesBadminton >= 75;

        if (volleyball && tennis && badminton)
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", playerName, total);
        else
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", playerName, total);
    }

    public static void cruiseShip() {
        Scanner scan = new Scanner(System.in);
        String cruiseType = scan.nextLine();
        String roomType = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double price = 0;
        double total = 0;

        if (roomType.equals("standard cabin")) {
            if (cruiseType.equals("Mediterranean"))
                price = 27.5;
            else if (cruiseType.equals("Adriatic"))
                price = 22.99;
            else if (cruiseType.equals("Aegean"))
                price = 23.00;
        } else if (roomType.equals("cabin with balcony")) {
            if (cruiseType.equals("Mediterranean"))
                price = 30.20;
            else if (cruiseType.equals("Adriatic"))
                price = 25;
            else if (cruiseType.equals("Aegean"))
                price = 26.6;
        } else if (roomType.equals("apartment")) {
            if (cruiseType.equals("Mediterranean"))
                price = 40.50;
            else if (cruiseType.equals("Adriatic"))
                price = 34.99;
            else if (cruiseType.equals("Aegean"))
                price = 39.80;
        }

        total = price * nights * 4;

        if (nights > 7)
            total = total - (total * 0.25);

        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruiseType, total);
    }

    public static void summerShopping() {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double priceBeachTowel = Double.parseDouble(scan.nextLine());
        double discount = Double.parseDouble(scan.nextLine());

        double priceUmbrella = priceBeachTowel * 2.0 / 3.0;
        double priceFlipFlops = priceUmbrella * 0.75;
        double priceBeachBag = (priceFlipFlops + priceBeachTowel) / 3.0;

        double total = priceBeachBag + priceFlipFlops + priceUmbrella + priceBeachTowel;
        total = total - (total * (discount / 100.0));

        if (budget - total >= 0) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", total, budget - total);
        } else
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", total, Math.abs(budget - total));
    }

    public static void savings() {
        Scanner scan = new Scanner(System.in);
        double monthlyIncome = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double monthlyNeeds = Double.parseDouble(scan.nextLine());

        double savings = monthlyIncome - (monthlyIncome * 0.3);
        savings = savings - monthlyNeeds;

        double percent = savings / monthlyIncome * 100;
        savings = savings * months;

        System.out.printf("She can save %.2f", percent);
        System.out.println("%");
        System.out.printf("%.2f\n", savings);
    }
}
