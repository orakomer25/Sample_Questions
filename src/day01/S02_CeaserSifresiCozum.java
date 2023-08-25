package day01;

import java.util.Scanner;

public class S02_CeaserSifresiCozum {
    public static void main(String[] args) {
        System.out.println("lütfen şifre için bir kelime giriniz");
        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();
        String sifre=ceaserSifresi(kelime);
        System.out.println(sifre);
    }

    public static String ceaserSifresi(String kelime) {
        String decoded = "";
        int lastCharValue = 'z';
        int alphabetLength = 'z' - 'a' + 1;
        for (char character: kelime.toCharArray()) {
            int charNoRotation = character + 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            decoded += (char) charValue;
        }
        return decoded;
    }
}
