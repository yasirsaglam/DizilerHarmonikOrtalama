import java.util.Scanner;

public class Main {

    public static double HarmonikOrt(int[] harmonik) {
        double sonuc = 0;
        for (int j : harmonik) {
            sonuc += (1.0 / j);
        }
        return harmonik.length / sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını (N) giriniz : ");
        int n = input.nextInt();

        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman : ");
            dizi[i] = input.nextInt();
        }
        System.out.print("Dizinin Harmonik Ortalaması : " + HarmonikOrt(dizi));
    }
}
