package Transpoz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısı n: ");
        int n = scanner.nextInt();
        System.out.print("Matrisin sütun sayısı m: ");
        int m = scanner.nextInt();

        int[][] matris = new int[n][m];
        int[][] transpoze = new int[m][n];

        // Matrisi kullanıcıdan al
        System.out.println("Matrisi giriniz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu al
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpoze[i][j] = matris[j][i];
            }
        }

        // Matrisi ve transpozunu ekrana yazdır
        System.out.println("Matris:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpoze:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpoze[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
