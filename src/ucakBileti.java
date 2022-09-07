import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        double yasIndirimOrani;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lüften mesafeyi giriniz(km) : ");
        mesafe = inp.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini seçiniz : ");
        System.out.println("1 => Tek yön\n2 => Gidiş-dönüş");
        tip = inp.nextInt();

        if((mesafe >0) && (yas>0) && (tip==1 ||tip==2) ){
            if(yas <12){
                yasIndirimOrani = 0.50;

            } else if (yas>12 && yas<=24) {
                yasIndirimOrani = 0.10;

            } else if (yas > 65) {
                yasIndirimOrani = 0.30;
            }else{
                yasIndirimOrani = 0;
            }

            double normalTutar = mesafe * 0.10;
            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;
            double toplamTutar;

            if(tip==2){
                double gdbi = indirimliTutar *0.20;
                toplamTutar= (indirimliTutar - gdbi)*2;
            }else{
                toplamTutar = indirimliTutar;
            }
            System.out.print("Toplam Tutar : " + toplamTutar + "TL");
        }else{
            System.out.print("Hatalı veri girdiniz.. !!!");
        }



    }
}
