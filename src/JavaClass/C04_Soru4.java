package JavaClass;

import java.lang.reflect.Array;

public class C04_Soru4 {

 //Verilen bir stringte belirli bir karakterin kaç kez tekrarlandığını bulun.
 public static void main(String[] args) {
     String str = "Java Candir";
     int sayac = 0;

     char karakter = 'a';

     for (int i = 0; i < str.length(); i++) {

         if(karakter == str.charAt(i))
         {
             sayac++;

         }

     }
     System.out.println(sayac);
 }

}
