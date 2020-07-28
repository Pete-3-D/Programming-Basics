import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paintedEggs = Integer.parseInt(scan.nextLine());
        String color = "";

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;

        for (int i = 1; i <= paintedEggs; i++) {
            color = scan.nextLine();

            switch (color) {
                case "red":
                    redEggs++;
                    break;
                case "orange":
                    orangeEggs++;
                    break;
                case "blue":
                    blueEggs++;
                    break;
                case "green":
                    greenEggs++;
                    break;
            }
        }

        System.out.printf("Red eggs: %d\n", redEggs);
        System.out.printf("Orange eggs: %d\n", orangeEggs);
        System.out.printf("Blue eggs: %d\n", blueEggs);
        System.out.printf("Green eggs: %d\n", greenEggs);
        System.out.printf("Max eggs: ");

        int maxEggs = 0;
        String maxEggsColor = "";

        if (redEggs > orangeEggs && redEggs > blueEggs && redEggs > greenEggs) {
            maxEggs = redEggs;
            maxEggsColor = "red";
        } else if (orangeEggs > redEggs && orangeEggs > blueEggs && orangeEggs > greenEggs) {
            maxEggs = orangeEggs;
            maxEggsColor = "orange";
        } else if (blueEggs > redEggs && blueEggs > orangeEggs && blueEggs > greenEggs) {
            maxEggs = blueEggs;
            maxEggsColor = "blue";
        } else if (greenEggs > redEggs && greenEggs > orangeEggs && greenEggs > blueEggs) {
            maxEggs = greenEggs;
            maxEggsColor = "green";
        }

        System.out.printf("%d -> %s\n", maxEggs, maxEggsColor);

    }
}
