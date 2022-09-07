import java.util.Scanner;


public class artikYil {
    public static void main(String[] args) {
         int year;

         Scanner inp = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        year = inp.nextInt();


        if((year>0) && (year%100 ==0)){
            if(year % 400 ==0 ){
                System.out.println(year + " bir artık yıldır");
            }else{
                System.out.println(year + " bir artık yıl değildir");
            }
        }else if(year % 4 ==0){
            System.out.println( year + " bir artık yıldır");
        }else{
            System.out.println( year + " bir atık yıl değildir");
        }
    }
}
