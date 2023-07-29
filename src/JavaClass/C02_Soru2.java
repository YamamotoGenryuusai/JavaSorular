package JavaClass;

import java.util.Scanner;

public class C02_Soru2 {




    public static void main(String[] args) {
        //kullanicidan ismini alin ve
        // ortadaki harfi yazdirin
        // ismin uzunkugu cift sayi ise orta kisimdaki 2harfi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz");
        String isim = scanner.next();

        int uzunluk = isim.length();

        if(uzunluk%2==0)
        {
            System.out.println("Orta iki harf :" + isim.charAt(uzunluk / 2 -1) + isim.charAt((uzunluk / 2))  );
        }
        else
        {
            System.out.println(isim.charAt(uzunluk/2));
        }


    }
}
