import java.util.Scanner;

public class sınıfGeçme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam=0,inculed=0;

        Scanner lesson = new Scanner(System.in);

        System.out.println("Matematik notunuz : " );
        mat = lesson.nextInt();
        if((mat>=0)&&(mat <=100)){
            toplam += mat;
            inculed ++;
        }else{
            System.out.println("luften 0 ile 100 arasında değer giriniz! : ");
        }

        System.out.println("fizik notunuz : " );
        fizik = lesson.nextInt();
        if((fizik>=0)&&(fizik <=100)){
            toplam += fizik;
            inculed ++;
        }else{
            System.out.println("luften 0 ile 100 arasında değer giriniz! : ");
        }

        System.out.println("türkce notunuz : " );
        turkce = lesson.nextInt();
        if((turkce>=0)&&(turkce <=100)){
            toplam += turkce;
            inculed ++;
        }else{
            System.out.println("luften 0 ile 100 arasında değer giriniz! : ");
        }

        System.out.println("kimya notunuz : " );
        kimya = lesson.nextInt();
        if((kimya>=0)&&(kimya <=100)){
            toplam += kimya;
            inculed ++;
        }else{
            System.out.println("luften 0 ile 100 arasında değer giriniz! : ");
        }

        System.out.println("Müzik notunuz : " );
        muzik = lesson.nextInt();
        if((muzik>=0)&&(muzik <=100)){
            toplam += muzik;
            inculed ++;
        }else{
            System.out.println("luften 0 ile 100 arasında değer giriniz! : ");
        }



        double avrage = toplam/inculed;
        if(avrage <= 55){
            System.out.println("Sınıfta kaldınız ");
        }else{
            System.out.println("Tebrikler sınıfa geçtiniz :)  " );
        }
            System.out.println("Ortalamanız " + avrage);
    }
}
