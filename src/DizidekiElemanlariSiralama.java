import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Dizinin eleman sayisini giriniz :");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Olusturulacak dizinin elemanlarını giriniz : ");
            list[i] = input.nextInt();
        }
        for (int j = 0; j < list.length; j++) {
            System.out.println(j + 1 + "." + " Elemanı :" + list[j]);
        }
        Arrays.sort(list);
        System.out.println("Sıralama :" + (Arrays.toString(list)));




    }
}
