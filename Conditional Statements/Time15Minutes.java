import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minute = Integer.parseInt(scan.nextLine());

        minute = minute + 15;

        if (minute / 60 == 1) {
            hour++;
            minute = minute % 60;
        }

        if (hour / 24 == 1) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minute);
    }
}
