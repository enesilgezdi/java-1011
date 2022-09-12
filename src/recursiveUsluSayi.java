import java.util.Scanner;

public class recursiveUsluSayi {
    static int us(int taban , int usDeger){
        if(usDeger == 0){
            return 1;
        }
        return taban* us(taban,usDeger -1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        int taban = scan.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        int usDeger = scan.nextInt();

        System.out.println("Sonuç : " + us(taban, usDeger));
    }
}
