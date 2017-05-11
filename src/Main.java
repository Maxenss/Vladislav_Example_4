import java.util.Scanner;

import java.security.SecureRandom;

/**
 * Created by Maxim on 11.05.2017.
 */
public class Main {
    private static void Example1() {
        int n = 10;
        int H[] = new int[n];
        int D[] = new int[n];

        SecureRandom secureRandom = new SecureRandom();

        System.out.print("H : ");

        for (int i = 0; i < H.length; i++) {
            H[i] = secureRandom.nextInt(10);

            System.out.print(H[i] + " ");

        }

        System.out.println();
        System.out.print("D : ");

        for (int i = 0; i < D.length; i++) {
            D[i] = secureRandom.nextInt(10);

            System.out.print(D[i] + " ");
        }
        System.out.println();

        int bestH1 = H[0];
        int lowH1 = H[0];

        for (int i = 0; i < H.length; i++) {
            if (H[i] > bestH1) {
                bestH1 = H[i];
            }
            if (H[i] < lowH1) {
                lowH1 = H[i];
            }
        }
        int bestD1 = H[0];
        int lowD1 = H[0];

        for (int i = 0; i < D.length; i++) {
            if (D[i] > bestD1) {
                bestD1 = D[i];
            }
            if (D[i] < lowD1) {
                lowD1 = D[i];
            }
        }
        System.out.println("Лучший H1 : " + bestH1);
        System.out.println("Худший H1 : " + lowH1);
        System.out.println("Лучший D1 : " + bestD1);
        System.out.println("Худший D1 : " + lowD1);

        int bestH2 = H[0];
        int lowH2 = H[0];

        int bestD2 = D[0];
        int lowD2 = D[0];

        for (int i = 0; i < H.length; i++) {
            if (H[i] >= bestH2 && H[i] < bestH1) {
                bestH2 = H[i];
            }
            if (H[i] <= lowH2 && H[i] > lowH1) {
                lowH2 = H[i];
            }
        }
        for (int i = 0; i < D.length; i++) {
            if (D[i] >= bestD2 && D[i] < bestD1) {
                bestD2 = D[i];
            }
            if (D[i] <= lowD2 && D[i] < lowD1) {
                lowD2 = D[i];
            }
        }
        System.out.println("Лучший H2 : " + bestH2);
        System.out.println("Худший H2 : " + lowH2);
        System.out.println("Лучший D2 : " + bestD2);
        System.out.println("Худший D2 : " + lowD2);

        int bestH3 = H[0];
        int lowH3 = H[0];
        int bestD3 = D[0];
        int lowD3 = D[0];

        for (int i = 0; i < H.length; i++) {
            if (H[i] >= bestH3 && H[i] < bestH2 && H[i] < bestH1) {
                bestH3 = H[i];
            }
            if (H[i] <= lowH3 && H[i] <= lowH2 && H[i] <= lowH1)
                lowH3 = H[i];
        }
        for (int i = 0; i < D.length; i++) {
            if (D[i] >= bestD3 && D[i] < bestD2 && D[i] < bestD1) {
            }
            if (D[i] <= lowD3 && D[i] < lowD2 && D[i] < lowD1) ;
        }

        System.out.println("Лучший H3 : " + bestH3);
        System.out.println("Худший H3 : " + lowH3);
        System.out.println("Лучший D3 : " + bestD3);
        System.out.println("Худший D3 : " + lowD3);
    }

    private static void Example2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму : ");
        double sum = scanner.nextDouble();
        System.out.print("Введите курс для конвертации : ");
        double course = scanner.nextDouble();

        double result = convertation(sum, course);

        System.out.println("Сумма после конвертации : " + result);
    }

    private static double convertation(double sum, double course) {
        double res = sum * course;
        return res;
    }

    public static void main(String[] args) {
        //Example1();
        Example2();
    }
}
