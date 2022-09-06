import java.util.Scanner;

public class manavKasaP {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo : " );
        armut= input.nextDouble();
        System.out.print("Elma kaç kilo : " );
        elma= input.nextDouble();
        System.out.print("Domates kaç kilo : " );
        domates= input.nextDouble();
        System.out.print("Muz kaç kilo : " );
        muz= input.nextDouble();
        System.out.print("Patlıcan kaç kilo : " );
        patlican= input.nextDouble();

        double aFiyat = armut*a;
        double eFiyat = elma*e;
        double dFiyat = domates*d;
        double mFiyat = muz*m;
        double pFiyat = patlican*p;

        double toplam = aFiyat+eFiyat+dFiyat+mFiyat+pFiyat;
        System.out.println("Toplam tutar : " + toplam);


    }
}
