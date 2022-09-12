import java.util.Scanner;
public class recursiveDesen {
    static void desen(int n) {
        int temp = n;
        int x = 0;
        if (temp > 1) {
            while (temp > 0) {
                System.out.print(temp + " , ");
                temp -= 5;
                x++;
            }
        }
        for (int i = 1; i <= x + 1; i++) {
            System.out.print(temp + " , ");
            temp += 5;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        n = scan.nextInt();
        desen(n);

    }
}
