import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, comb, totalN=1, totalR=1, totalNr=1;
        System.out.print("n değerini giriniz: ");
        n=input.nextInt();
        System.out.print("r değerini giriniz: ");
        r=input.nextInt();

        for (int i = 1; i<=n ; i++){
            totalN *= i;
        }
        for (int j = 1; j<=r; j++){
            totalR *= j;
        }
        int nFarkR = n-r;
        for (int k = 1; k<= nFarkR; k++){
            totalNr*=k;
        }

        comb = totalN/(totalR * totalNr);

        if(n>r){
            System.out.println("N'in R'li kombinasyonu : " + comb);
        }else{
            System.out.println("R sayısı N sayısından büyük olamaz !!!!");
        }


    }
}
