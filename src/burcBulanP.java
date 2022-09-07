import java.util.Scanner;

public class burcBulanP {
    public static void main(String[] args) {
        int mounth,day;

        boolean isErrror = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");;
        mounth = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day=input.nextInt();

        if((mounth == 1) && (day>=1 && day <=31)){
            if(day <22){
                System.out.print("Oğlak burcu");
            }else{
                System.out.print("Kova burcu");
            }
        }else if((mounth==2) && (day>=1 && day <=28)){
            if(day <20){
                System.out.print("Kova Burcu");
            }else{
                System.out.print("Balık Burcu");
            }
        }else if((mounth==3) && (day>=1 && day <=31)){
            if(day <21){
                System.out.print("Balık Burcu");
            }else{
                System.out.print("Koç Burcu");
            }
        }else if((mounth==4) && (day>=1 && day <=30)){
            if(day <21){
                System.out.print("Koç Burcu");
            }else{
                System.out.print("Boğa Burcu");
            }
        }else if((mounth==5) && (day>=1 && day <=31)){
            if(day <22){
                System.out.print("Boğa Burcu");
            }else{
                System.out.print("İkizler Burcu");
            }
        }else if((mounth==6) && (day>=1 && day <=30)){
            if(day <22){
                System.out.print("İkizler Burcu");
            }else{
                System.out.print("Yengeç Burcu");
            }
        }else if((mounth==7) && (day>=1 && day <=31)){
            if(day <22){
                System.out.print("Yengeç Burcu");
            }else{
                System.out.print("Aslan Burcu");
            }
        }else if((mounth==8) && (day>=1 && day <=31)){
            if(day <23){
                System.out.print("Aslan Burcu");
            }else{
                System.out.print("Başak Burcu");
            }
        }else if((mounth==9) && (day>=1 && day <=30)){
            if(day <23){
                System.out.print("Başak Burcu");
            }else{
                System.out.print("Terazi Burcu");
            }
        }else if((mounth==10) && (day>=1 && day <=31)){
            if(day <23){
                System.out.print("Terazi Burcu");
            }else{
                System.out.print("Akrep Burcu");
            }
        }else if((mounth==11) && (day>=1 && day <=30)){
            if(day <22){
                System.out.print("Akrep Burcu");
            }else{
                System.out.print("Yay Burcu");
            }
        }else if((mounth==12) && (day>=1 && day <=31)){
            if(day <22){
                System.out.print("Yay Burcu");
            }else{
                System.out.print("Oğlak Burcu");
            }
        }



    }
}
