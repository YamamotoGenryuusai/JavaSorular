package JavaClass;

public class C05_Soru5 {

    // Verilen bir stringi tersine çevirin (örn. "merhaba" -> "abahrem").

    public static void main(String[] args) {
        String ornekDize = "Merhaba dünya!";
        String tersDize = tersCevir(ornekDize);
        System.out.println("Orijinal dize: " + ornekDize);
        System.out.println("Ters çevrilmiş dize: " + tersDize);
    }

    public static String tersCevir(String dize) {
        char[] karakterler = dize.toCharArray();
        int i = 0;
        int j = karakterler.length - 1;

        while (i < j) {
            char temp = karakterler[i];
            karakterler[i] = karakterler[j];
            karakterler[j] = temp;
            i++;
            j--;
        }
        return new String(karakterler);
    }
}
