//Mengimport Dari Library Java
import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public class D_TestRedDegereeSinCos {
    public static void main(String[] args) {
        //Membuat Variabel
        //Value Of PI In Degrees
        double rad = PI;
        System.out.println(toDegrees(rad));
        //Value Of PI/2 In Degrees
        rad = PI/2;
        System.out.println(toDegrees(rad));
        //Vlaue Of PI/3 In Degrees
        rad = PI/3;
        System.out.println(toDegrees(rad));
        //Value OF PI/4 In Degrees
        rad = PI/4;
        System.out.println(toDegrees(rad));

        //Menampilkan Nilai Sin & Cos
        System.out.println("Sin 90 Derajat Adalah " +sin(toRadians(90)));
        System.out.println("Cos 60 Derajat Adalah " +cos(toRadians(60)));
    }
}
