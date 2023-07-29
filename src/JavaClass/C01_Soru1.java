package JavaClass;

import java.util.Scanner;

public class C01_Soru1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = sayi/10;


        switch (onlarBasamagi)
        {
            case 1 :
                System.out.println("on");
                break;
            case 2 :
                System.out.println("yirmi");
                break;
            case 3 :
                System.out.println("otuz");
                break;
            case 4 :
                System.out.println("kırk");
                break;
            case 5 :
                System.out.println("elli");
                break;
            case 6 :
                System.out.println("atmış");
                break;
            case 7 :
                System.out.println("yetmiş");
                break;
            case 8 :
                System.out.println("seksen");
                break;
            case 9 :
                System.out.println("doksan");
                break;
        }

        switch (birlerBasamagi)
        {
            case 1 :
                System.out.println("on");
                break;
            case 2 :
                System.out.println("yirmi");
                break;
            case 3 :
                System.out.println("otuz");
                break;
            case 4 :
                System.out.println("kırk");
                break;
            case 5 :
                System.out.println("elli");
                break;
            case 6 :
                System.out.println("atmış");
                break;
            case 7 :
                System.out.println("yetmiş");
                break;
            case 8 :
                System.out.println("seksen");
                break;
            case 9 :
                System.out.println("doksan");
                break;
        }






    }








}
