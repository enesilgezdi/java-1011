import java.util.Scanner;

public class yıldızlarUcgenY {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Bir Sayı giriniz : ");
        n = inp.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= (n - a); b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= ( 2* a - 1 ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
        for (int a = 1; a < n; a++) {
            for ( int b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= ( 2 * n - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
