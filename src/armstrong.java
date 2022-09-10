import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("sayı giriniiz : ");
        int a = sc.nextInt(),basamak = 0;
        int tempNumber = a;
        while(tempNumber!=0){
            basamak++;
            tempNumber = tempNumber/10;
        }
        tempNumber = a;
        double sum = Math.pow((tempNumber%10),basamak);
        while(tempNumber!=0){
            tempNumber/=10;
            sum+= Math.pow((tempNumber%10),basamak);
        }
        if(sum == a){
            System.out.println(a + " Sayısı bir Armstrong sayıdır.");
        }
        else{
            System.out.println(a + " Sayısı bir Armstrong sayı DEĞİLDİR");
        }
        sc.close();
        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");


        int num = sc.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam +=  (num%10);
            num /= 10;
            ++adet;
        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplamı: " + toplam);
    }
}
