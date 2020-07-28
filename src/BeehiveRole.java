import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intellect = Integer.parseInt(scan.nextLine());
        int strength = Integer.parseInt(scan.nextLine());
        String gender = scan.nextLine();
        String role = whatRole(intellect, strength, gender);

        System.out.println(role);
    }

    private static String whatRole(int intellect, int strength, String gender) {
        String role = "";

        if (intellect >= 80) {
            if (strength >= 80) {
                if ("female".equals(gender)) {
                    role = "Queen Bee";
                    return role;
                } else {
                    role = "Repairing Bee";
                    return role;
                }
            } else {
                role = "Repairing Bee";
                return role;
            }
        } else if (intellect >= 60) {
            role = "Cleaning Bee";
            return role;
        }

        if (strength >= 80) {
            if ("male".equals(gender)) {
                role = "Drone Bee";
                return role;
            } else {
                role = "Guard Bee";
                return role;
            }
        } else if (strength >= 60) {
            role = "Guard Bee";
            return role;
        } else {
            role = "Worker Bee";
            return role;
        }
    }
}

