package operator;

public class IfElse {
    public static void main (String[] args){
        double totalbelanja = 53000;
        double uangdidompet = 25000;

        if (uangdidompet>totalbelanja){
            System.out.println("Uangnya Tidak Cukup, Ngutang dulu");
        }else{
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}