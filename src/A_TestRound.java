//Mengimport Dari Library Java
import static java.lang.Math.round;

public class A_TestRound {
    public static void main(String[] args) {
        //Membuat Variabel
        double varDouble = 2.73;
        long roundResult = round(varDouble);

        //Melakukan Pembulatan
        System.out.printf("Pembulatan Round %.2f Adalah %d\n", varDouble, roundResult);

        varDouble = 2.49;
        roundResult = round(varDouble);
        System.out.printf("Pembulatan Floor %.2f Adalah %d\n", varDouble, roundResult);
    }
}
