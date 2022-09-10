import java.util.Scanner;
public class tekSayilarOdev {
    public static void main(String[] args) {
        int n;
        int total=0;

        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            n=inp.nextInt();
            if(n%4 ==0){
                total +=n;
            }

        }while (n %2==0);

        System.out.print("Cift ve 4'ün katları sayılrın toplamı : " + total);
    }
}
