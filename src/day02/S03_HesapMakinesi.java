package day02;

import java.util.Scanner;

public class S03_HesapMakinesi {
    public static void main(String[] args) {

        System.out.println("Lütfen islemde kullanmak istediginiz sayiyi giriniz");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ilk sayi: ");
        double ilkSayi = scanner.nextDouble();

        System.out.println("");
        System.out.println("Yapmak istediginiz islem türünü seciniz: ");
        System.out.println("Toplama icin --->   +");
        System.out.println("Cikarma icin --->   -");
        System.out.println("Carpma icin  --->   *");
        System.out.println("Bölme icin   --->   /");
        System.out.println("0 - Cikis");

        char secim = scanner.next().charAt(0);
        double ikinciSayi;
        double sonuc;


        if (secim == '0') {
            System.out.println("\nCikis yapiliyor.");

        } else {
            while (secim != '0') {

                if (!(secim == '+' || secim == '-' || secim == '*' || secim == '/')) {
                    System.out.println("\nHatali giris yaptiniz lütfen tekrar deneyiniz.");
                    secim = scanner.next().charAt(0);

                }
                if (secim == '+') {
                    System.out.println("islemde kullanmak istediginiz yeni sayiyi girin:");
                    ikinciSayi = scanner.nextDouble();
                    sonuc = ilkSayi + ikinciSayi;
                    System.out.println("Girilen sayilarin toplami: " + sonuc);
                    ilkSayi = sonuc;
                    System.out.println("\nIslem türünü secin: + , -, *, /\nCikis icin 0'a basin");
                    secim = scanner.next().charAt(0);

                }
                if (secim == '-') {
                    System.out.println("islemde kullanmak istediginiz yeni sayiyi girin:");
                    ikinciSayi = scanner.nextDouble();
                    sonuc = ilkSayi - ikinciSayi;
                    System.out.println("Cikarma islemi sonucu: " + sonuc);
                    ilkSayi = sonuc;
                    System.out.println("\nIslem türünü secin: + , -, *, /\nCikis icin 0'a basin");
                    secim = scanner.next().charAt(0);

                }
                if (secim == '*') {
                    System.out.println("islemde kullanmak istediginiz yeni sayiyi girin:");
                    ikinciSayi = scanner.nextDouble();
                    sonuc = ilkSayi * ikinciSayi;
                    System.out.println("Girilen sayilarin carpimi: " + sonuc);
                    ilkSayi = sonuc;
                    System.out.println("\nIslem türünü secin: + , -, *, /\nCikis icin 0'a basin");
                    secim = scanner.next().charAt(0);
                }
                if (secim == '/') {
                    System.out.println("islemde kullanmak istediginiz yeni sayiyi girin:");
                    ikinciSayi = scanner.nextDouble();
                    sonuc = ilkSayi / ikinciSayi;
                    System.out.println("Girlen sayilarin bölüm sonucu: " + sonuc);
                    ilkSayi = sonuc;
                    System.out.println("\nIslem türünü secin: + , -, *, /\nCikis icin 0'a basin");
                    secim = scanner.next().charAt(0);
                }
            }
        }
    }
}