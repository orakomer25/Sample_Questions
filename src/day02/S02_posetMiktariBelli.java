package day02;

import java.util.Scanner;

public class S02_posetMiktariBelli {
    public static void main(String[] args) {
        /*
        Belirli sayıda küçük pirinç torbasına (her biri 1 kilo) ve
        büyük pirinç torbalarına (her biri 5 kilo) sahip olmanız koşuluyla,
        hedef kiloluk pirinç içeren bir paket yapmak mümkünse doğru dönen bir method yazın.
        not :  toplam pirinç mitarını,birlik ve beşlik poşet sayısını kullanıcıdan alalım



         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("toplam pirinç miktarını giriniz");
        int pirincMiktari= scanner.nextInt();
        System.out.println("1 lik poşet sayısını giriniz");
        int birlik= scanner.nextInt();
        System.out.println("5 lik poşet miktarını giriniz");
        int beslik= scanner.nextInt();
        System.out.println(alirMiAlmazMi(pirincMiktari, beslik, birlik));
    }

    public static boolean alirMiAlmazMi(int pirincMiktari, int beslik, int birlik) {
        boolean sonuc =false;
        if (beslik*5>=pirincMiktari){
            if (pirincMiktari%5<=birlik){
                sonuc=true;
            }
        }else {
            if ((pirincMiktari-beslik*5)<=birlik){
                sonuc=true;
            }
        }
        return sonuc;
    }
}
