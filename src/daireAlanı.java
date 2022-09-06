import java.util.Scanner;

public class daireAlanı {
    public static void main(String[] args) {
       double pi=3.14, alan, cevre;
       int r;
       Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarı çapını giriniz : " );
        r = input.nextInt();
        alan = pi * (r * r);
        cevre = 2*(pi*r);
        System.out.println("Dairenin alanı : " + alan );
        System.out.println("Dairenin cevresi : " + cevre);
    }
}
