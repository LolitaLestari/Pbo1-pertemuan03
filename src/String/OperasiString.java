package String;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "yogyakarta";

        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaStriing = new String(uniskaChar);
        System.out.println(uniskaStriing);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
}
