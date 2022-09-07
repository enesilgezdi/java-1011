import java.util.Scanner;


public class cinZodyagi {
    public static void main(String[] args) {
        int year;

        Scanner inp = new Scanner(System.in);

        System.out.println("Doğum Yılınızı giriniz : ");
        year = inp.nextInt();

        double czBurcu = (year % 12);

        if(czBurcu ==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun ");
        } else if (czBurcu == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz ");
        } else if (czBurcu == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek ");
        } else if (czBurcu == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz ");
        } else if (czBurcu == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare ");
        } else if (czBurcu == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz ");
        } else if (czBurcu == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan ");
        } else if (czBurcu == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan ");
        } else if (czBurcu == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha ");
        } else if (czBurcu == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan ");
        } else if (czBurcu == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At ");
        } else if (czBurcu == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun ");
        }


    }
}
