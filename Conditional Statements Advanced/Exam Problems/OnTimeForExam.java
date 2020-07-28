import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourExam = Integer.parseInt(scan.nextLine());
        int minuteExam = Integer.parseInt(scan.nextLine());
        int hourArrival = Integer.parseInt(scan.nextLine());
        int minuteArrival = Integer.parseInt(scan.nextLine());

        int totalExam = hourExam * 60 + minuteExam;
        int totalArrival = hourArrival * 60 + minuteArrival;
        int difference = Math.abs(totalArrival - totalExam);
        int differenceH = difference / 60;
        int differenceM = difference % 60;


        if (totalArrival > totalExam) {
            System.out.println("Late");
            if (difference < 60)
                System.out.printf("%d minutes after the start", difference);
            else if (difference >= 60)
                System.out.printf("%d:%02d hours after the start", differenceH, differenceM);
        } else if (totalArrival <= totalExam) {
            if (difference == 0) {
                System.out.println("On time");
            } else if (difference <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", differenceM);
            } else if (difference > 30) {
                System.out.println("Early");
                if (difference < 60)
                    System.out.printf("%d minutes before the start", difference);
                else if (difference >= 60)
                    System.out.printf("%d:%02d hours before the start", differenceH, differenceM);
            }
        }

    }
}
