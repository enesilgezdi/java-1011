import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz : ");
        sıcaklık = input.nextInt();

        if(sıcaklık < 5){
            System.out.println("Kayak yapabilirsiniz ");
        } else if (sıcaklık >=5 && sıcaklık <10){
            System.out.println("Sinemaya gidebilirsin ");
        } else if (sıcaklık >=10 && sıcaklık <15) {
            System.out.println("Sinema veya piknige gidebilirsin ");
        } else if (sıcaklık>=15 && sıcaklık <25) {
            System.out.println("Piknige gidebilirsin ");
        } else if (sıcaklık>=25) {
            System.out.println("Yüzmeye gidebilirsin ");

        }

    }
}
