import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = "";
        double freeSeats = 0;
        String ticketType = "";

        double total = 0;
        double totalStandard = 0;
        double totalStudent = 0;
        double totalKid = 0;

        double nStandard = 0;
        double nStudent = 0;
        double nKid = 0;

        //double percentFull = 0;

        while (!movieName.equals("Finish")) {
            movieName = scan.nextLine();

            if (movieName.equals("Finish")) {
                System.out.printf("Total tickets: %.0f\n", total);
                System.out.printf("%.2f", totalStudent / total * 100);
                System.out.println("% student tickets.");
                System.out.printf("%.2f", totalStandard / total * 100);
                System.out.println("% standard tickets.");
                System.out.printf("%.2f", totalKid / total * 100);
                System.out.println("% kids tickets.");
                return;
            }

            freeSeats = Double.parseDouble(scan.nextLine());

            for (int i = 1; i <= freeSeats; i++) {
                ticketType = scan.nextLine();

                if (ticketType.equals("standard")) {
                    nStandard++;
                    totalStandard++;
                    total++;
                } else if (ticketType.equals("student")) {
                    nStudent++;
                    totalStudent++;
                    total++;
                } else if (ticketType.equals("kid")) {
                    nKid++;
                    totalKid++;
                    total++;
                }

                if (ticketType.equals("End"))
                    break;
            }
            System.out.printf("%s - %.2f", movieName, (nKid + nStandard + nStudent) / freeSeats * 100);
            System.out.println("% full.");
            nStandard = 0;
            nKid = 0;
            nStudent = 0;
        }
    }
}

