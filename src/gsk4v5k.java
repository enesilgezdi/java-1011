import java.util.Scanner;
public class gsk4v5k {
    public static void main(String[] args) {
        int n ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = scan.nextInt();

        for(int i = 1; i<=n; i*=4){
            System.out.println(i);
        }

        for (int i = 1; i<=n; i*=5){
            System.out.println(i);
        }
    }
}
