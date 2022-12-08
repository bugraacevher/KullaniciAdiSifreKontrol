package Giris;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adinizi girin : ");
        username = inp.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password = inp.nextLine();

        //equals = esitlik siniflar kavraminda daha net anlasilir. Stringler icin esitlik durumu.
        if ((username.equals("patika") ) && (password.equals("java123")  )){
            System.out.print("Giris basarili :)");
        }else{
            System.out.println("Kullanici adi veya sifre hatali !! ");
        }
    }
}
