import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                for (int k = begin; k <= end; k++) {
                    for (int l = begin; l <= end; l++) {
                        if (i > l) {
                            if ((j + k) % 2 == 0) {
                                if (i % 2 == 0) {
                                    if (l % 2 == 1) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                } else {
                                    if (l % 2 == 0) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
