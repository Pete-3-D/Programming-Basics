import java.util.Scanner;

public class Scholarships {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double avgGrade = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = Math.floor(minSalary * 0.35);
        double academicScholarship = Math.floor(avgGrade * 25);

        if (avgGrade < 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (avgGrade > 4.50 && avgGrade < 5.50) {
            if (income > minSalary)
                System.out.println("You cannot get a scholarship!");
            else
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (avgGrade >= 5.50) {
            if (income < minSalary) {
                if (socialScholarship > academicScholarship)
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                else if (academicScholarship >= socialScholarship)
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", academicScholarship);
            } else
                System.out.printf("You get a scholarship for excellent results %.0f BGN", academicScholarship);
        }
    }
}
