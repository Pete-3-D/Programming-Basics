import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int nOfProjects = Integer.parseInt(scan.nextLine());
        int hoursToComplete = nOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, hoursToComplete, nOfProjects);
    }
}
