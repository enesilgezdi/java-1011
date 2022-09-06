import java.util.Scanner;


public class dikUcgen {
    public static void main(String[] args) {
        // Değişkenleri olusturalım

        int a, b;
        double c;

        // Kullanıcadan verileri alalım

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenus :" + c);
    }
}
