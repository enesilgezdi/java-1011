import java.util.Scanner;
public class minMaxOdev1 {
    public static void main(String[] args) {
        int n, k , min= 1 , max=1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç tane sayı giriceksiniz : ");
        n = scan.nextInt();

        for(int i = 1; i <=n; i ++){
            System.out.print(i + " sayıyı giriniz : ");
            k= scan.nextInt();

            if(i == 1){
                max = k;
                min = k;
            }
            if(k> max){
                max =k;
            }
            if(min> k ){
                min = k;
            }



        }
        System.out.println("En buyük sayı " + max);
        System.out.println("En kucuk sayı " + min);







    }
}
