import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Değişkenleri oluştur
        int mat, fizik,kimya, turkce ,tarih,muzik;

        // Scaner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanacıdan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6;
        System.out.println(sonuc >= 60 ? "sınıfı gecti" : "Sınıfta Kaldı");
        System.out.print(sonuc);







    }
}
