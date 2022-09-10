import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {
        int k , sum=0, c=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz:  ");
        k=inp.nextInt();

        for(int i =1; i<= k; i++){
            if((i%3==0) && (i%4==0)){
                sum +=i;
                c=2;
            }

        }
        System.out.println("ortalamala " + sum/c);
    }

}
