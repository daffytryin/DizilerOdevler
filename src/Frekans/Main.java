package Frekans;
import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Dizinin boyutu n: ");
            int n = scanner.nextInt();

            int[] dizi = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Elemanı: ");
                dizi[i] = scanner.nextInt();
            }

            // Diziyi küçükten büyüğe sırala
            Arrays.sort(dizi);

            // Elemanların frekanslarını hesapla ve ekrana yazdır
            int sayac = 1;
            for (int i = 1; i < n; i++) {
                if (dizi[i] == dizi[i - 1]) {
                    sayac++;
                } else {
                    System.out.println(dizi[i - 1] + " sayısı " + sayac + " kere tekrar edildi.");
                    sayac = 1;
                }
            }
            // Son elemanı da kontrol et
            System.out.println(dizi[n - 1] + " sayısı " + sayac + " kere tekrar edildi.");

            scanner.close();
        }
    }

