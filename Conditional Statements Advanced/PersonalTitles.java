import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float age = Float.parseFloat(scan.nextLine());
        String gender = scan.nextLine();

        if (gender.toLowerCase().equals("m")){
            if (age >= 16)
                System.out.println("Mr.");
            else
                System.out.println("Master");
        } else if (gender.toLowerCase().equals("f")){
            if (age >= 16)
                System.out.println("Ms.");
            else
                System.out.println("Miss");
        }
    }
}
