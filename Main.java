import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int k, toplam = 0, sayac = 0;

        //"k" sayısının girilmesi.

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();

        //Döngünün oluşturulması.

        for (int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                sayac += 1;
                toplam += i;
            }
        }

        //Ortalamanın hesaplanması ve sonucun yazılması.

        if (sayac > 0){
            double ort = toplam / sayac;
            System.out.println("Sayıların ortalaması: " + ort);
        } else {
            System.out.println("Sayı bulunamadı");
        }
        //https://app.patika.dev/
    }
}