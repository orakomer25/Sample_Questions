package day01;

import java.util.Arrays;
import java.util.Scanner;

public class S01_CeaserSifresi {
    public static void main(String[] args) {
        /*
        Ceasar şifresi, Julius Ceasar tarafından generalleriyle
        güvenli bir şekilde iletişim kurmak için kullanılan temel bir şifreleme tekniğidir.
        Her harf, İngiliz alfabesinin aşağısındaki başka bir N harfi ile değiştirilir.
        Örneğin, 5'lik bir dönüş için, 'c' harfi bir 'h' ile değiştirilir.
        'z' durumunda, alfabe döner ve 'd'ye dönüştürülür.
Ceasar şifresi için N = 5 olan bir kod çözücü uygulayın.
İPUCU: Bir karakter dizisi almak için code.toCharArray() kullanın.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen CEASER ŞİFRELEME için bir kelime giriniz");
        String kelime = scanner.next();
        String sifreCeaser=ceaserSifrele(kelime);

        System.out.println("Ceaser Şifresi : "+sifreCeaser);

        String orjinalSifre=sifreCeaserCoz(sifreCeaser);
        System.out.println("Orjinal şifre  : "+orjinalSifre);
    }

    public static String sifreCeaserCoz(String sifreCeaser) {
        String[] sifreCeaserArr = sifreCeaser.split("");
        char karakter;
        char[] sifreCeaserCharArr=new char[sifreCeaserArr.length];


        for (int i = 0; i < sifreCeaserArr.length; i++) {
            karakter = sifreCeaserArr[i].charAt(0);
            if (karakter>='f'&&karakter<='z'){
                karakter-=5;
                sifreCeaserCharArr[i]=karakter;
            } else if (karakter>='a'&&karakter<='e') {
                karakter += 21;
                sifreCeaserCharArr[i]=karakter;
            }

        }
        String ceaserSifreOrjinal="";
        for (int i = 0; i < sifreCeaserCharArr.length ; i++) {
            ceaserSifreOrjinal+=sifreCeaserCharArr[i];


        }
        return ceaserSifreOrjinal;
    }

    public static String ceaserSifrele(String kelime) {
        kelime.toLowerCase();
        String[] kelimeArr = kelime.split("");
        char karakter;
        char[] sifreCeaser=new char[kelimeArr.length];


        for (int i = 0; i < kelimeArr.length; i++) {
            karakter = kelimeArr[i].charAt(0);
            if (karakter>='a'&&karakter<='u'){
                karakter+=5;
                sifreCeaser[i]=karakter;
            } else if (karakter>='v'&&karakter<='z') {
                karakter -= 21;
                sifreCeaser[i] = karakter;
            }

        }
        String ceaserSifre="";
        for (int i = 0; i < sifreCeaser.length ; i++) {
            ceaserSifre+=sifreCeaser[i];


        }
        return ceaserSifre;

    }
}
