import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {
        String password, userName, sifirlama, newPassword;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName= inp.nextLine();

        System.out.print("Şifreniz : ");
        password= inp.nextLine();

        if(userName.equals("enesilgezdi") && password.equals("12345")){
            System.out.println("Başarılı giris yaptınız. ");
        }else if(!(userName.equals("enesilgezdi") || !(password.equals("12345")))){
            System.out.println("kullanıcı adı veya şifreniz yanlıs!! ");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?: E/H ");
            sifirlama = inp.nextLine();
            if (sifirlama.equals("H")){
                System.out.println("Lütfen yeniden giriş yapınız. ");
            }else if(sifirlama.equals("E")){
                System.out.println("Yeni şifrenizi giriniz");
                newPassword = inp.nextLine();
                if(newPassword.equals("12345")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("şifre oluşturuldu");
                }
            }

        }



    }

}
