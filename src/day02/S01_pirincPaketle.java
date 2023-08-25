package day02;

import java.util.Scanner;

public class S01_pirincPaketle {
    public static void main(String[] args) {
        /*
        Belirli sayıda küçük pirinç torbasına (her biri 1 kilo) ve
        büyük pirinç torbalarına (her biri 5 kilo) sahip olmanız koşuluyla,
        enaz sayida poşet kullanarak  hedef kiloluk pirinci paketleyen bir  method yazın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen paketlenecek pirinç miktarını giriniz");
        int pirincMiktari= scanner.nextInt();
        enazPosetIleAmbalajla(pirincMiktari);

    }

    public static void enazPosetIleAmbalajla(int pirincMiktari) {
        int beslik=0;
        int birlik=0;
        birlik=pirincMiktari%5;
        beslik=pirincMiktari/5;
        System.out.println("5 lik poşet sayısı : "+beslik+"\n1 lik poşet sayısı : "+birlik+
                "\nToplam poşet sayısı : "+(beslik+birlik));
    }
}
