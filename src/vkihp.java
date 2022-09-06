import java.util.Scanner;

public class vkihp {
    public static void main(String[] args) {
        double kg,m;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = girdi.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = girdi.nextDouble();

        double vki = kg / (m*m);
        System.out.print("Vucut kitle indeksiniz : " + vki);
    }
}
