import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını giriniz : " );
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdvsiz tutar : " + tutar);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv tutarı : " + kdvTutar);
        System.out.println("Kdvli tutarı : " + kdvliTutar);


    }
}
