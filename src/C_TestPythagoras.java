//Mengimport Dari Library Java
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class C_TestPythagoras {
    public static void main(String[] args) {
        //Membuat Variabel
        double a = 8;
        double b = 6;

        //Melakukan Operasi Matematis
        //Rumus Pythagoras
        double c = sqrt(pow(a,2) + pow(b,2));

        //Menampilkan Nilai Hasil
        System.out.println("C = " +c);
    }
}
