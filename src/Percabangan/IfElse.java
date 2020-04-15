package Percabangan;

public class IfElse {
    public static void main(String[]args) {
        double totalBelanja = 25000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, Kurangi jajan anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("uang Cukup, Angsul : "+angsul);
        }else{
            System.out.println("Uang Pas...Uwu...");
        }
    }
}
