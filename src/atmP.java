import java.util.Scanner;

public class atmP {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;
       while (right > 0 ){
           System.out.print("Kullanıcı Adınız : ");
           userName=input.nextLine();
           System.out.print("Parolanız : ");
           password = input.nextLine();

           if(userName.equals("enesilgezdi")&& password.equals("12345")){
               System.out.println("Merhaba kodluyoruz Bankasına Hoşgeldiniz ");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cıkıs Yap" );
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para Miktarı");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı");
                            int pricee = input.nextInt();
                            if(pricee > balance){
                                System.out.println("Bakiyeniz yetersiz");
                            }else{
                                balance -= pricee;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                }while (select !=4);
               System.out.println("İşleminiz bitmiştir. Tekrar görüşmek üzere");
               break;
           }else {
               right--;
               System.out.println("Hatalı Giris Yaptınız. Tekrar Deneyiniz.");

               if (right == 0){
                   System.out.println("Hesabınız Bloke Edilmiştir !!!! ");
               }else {
                   System.out.println("Kalan Hakkınız: " + right);
               }
           }
       }

    }
}