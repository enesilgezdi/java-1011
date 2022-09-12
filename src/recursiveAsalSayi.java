import java.util.Scanner;
public class recursiveAsalSayi {

    static boolean asalMi (int number){
        int sayac = 0;
        for(int i = 2; i< number; i++){
            if(number % i== 0 ){
                sayac++;
            }
        }
        if(sayac == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();

        if(asalMi(number)){
            System.out.print(number + " sayısı asal sayıdır :  ");
        }else{
            System.out.print( number + " sayısı asal  değildir !!!: ");
        }
    }
}
