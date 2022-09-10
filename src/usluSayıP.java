import java.util.Scanner;
public class usluSayıP {
    public static void main(String[] args) {
        int n, r, total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("üssü alınacak sayı : ");
        n=input.nextInt();
        System.out.print("üs olacak sayı : ");
        r=input.nextInt();

        for(int i = 1; i<=r; i++){
            total*=n;
        }

        System.out.println("Result :  " + total);
    }
}
