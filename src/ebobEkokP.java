import java.util.Scanner;

public class ebobEkokP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1>= 1 && n2>=1){
            int i=1,ebob=1;
            while (i<=n1){
                i++;
                if (n1 % i == 0 && n2 % i==0){
                    ebob = i;
                }
            }
            System.out.println( n1 + " ve "+ n2+ " değerleri için EBOB: "+ebob);

            int ekok;
            ekok = (n2*n1)/ebob;
            System.out.print(( n1 + " ve "+ n2+ " değerleri için EKOK: "+ekok));


        }else {
            System.out.print("Negatif değer girdiğiniz için program iptal edilmiştir!");
        }


    }
}
