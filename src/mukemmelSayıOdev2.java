import java.util.Scanner;
public class mukemmelSayıOdev2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        int k = scan.nextInt();

        for(int i =1; i<k; i++ ){
            if(k%i == 0){
                toplam += i;
            }
        }
        if(toplam == k){
            System.out.println( k  + " mükemmel sayıdır. ");
        }else{
            System.out.println(k + " mukemmel sayı değildir: ");
        }
    }
}
