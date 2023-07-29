package JavaClass;

public class C03_Soru3 {

     // 100den buyuk ilk 10 asal sayıyı yazdir


    public static void main(String[] args) {

        int sayac = 0;
        int sayi = 101;
        boolean flag = true;

        while (sayac<10)
        {
            for (int i = 2; i < sayi ; i++) {
                if(sayi%i==0)
                {
                    flag = false;
                }
            }
            if(flag==true){
                System.out.print(sayi+" ");
                sayac++;
            }

            sayi++;
             flag = true;
        }


    }



}
