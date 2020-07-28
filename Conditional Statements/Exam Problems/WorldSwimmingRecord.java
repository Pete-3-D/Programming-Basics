import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double speed = Double.parseDouble(scan.nextLine());

        double waterResistance = (int) distance / 15;
        waterResistance = waterResistance * 12.5;
        double time = distance * speed;
        time = time + waterResistance;

        if (time < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - record);
        }
    }
}
