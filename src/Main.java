import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double kilo,boy,sonuc;

        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");


        System.out.println("Vücut Kitle Endeksi Hesaplayıcıya Hoşgeldiniz!");
        Thread.sleep(1000);
        System.out.print("Lütfen boyunuzu giriniz (1,70 gibi): ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Teşekkürler hemen hesaplıyorum...");

        Thread.sleep(2000);

        sonuc = kilo/Math.pow(boy,2);

        System.out.println("Vücut kitle endeksiniz: "+formatter.format(sonuc));

        if (sonuc < 18.5){
            System.out.println("İdeal kilonun altındasınız.");
        }else if (sonuc > 18.5 && sonuc < 24.9){
            System.out.println("İdeal kilodasınız.");
        }else if (sonuc > 24.9 && sonuc < 29.9){
            System.out.println("İdeal kilonun üstündesiniz.");
        }else if (sonuc > 29.9 && sonuc < 39.9){
            System.out.println("İdeal kilonun çok üstündesiniz (obezite)");
        }else {
            System.out.println("İdeal kilonun aşırı üstündesiniz (morbid obezite)");
        }

    }
}
