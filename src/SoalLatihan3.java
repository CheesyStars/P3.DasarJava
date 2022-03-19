//Mengimport Dari Library Java
import java.util.Scanner;

public class SoalLatihan3 {
    public static void main(String[] args) {
        //Membuat Scanner Dan Variabel
        Scanner scan = new Scanner (System.in);

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Bilangan : ");
        int bilangan = scan.nextInt();

        //Percabangan If Else
        if (bilangan > 1) {
            if (bilangan == 2) {
                System.out.println(bilangan+ " Termasuk Bilangan Prima");
            }
            else if (bilangan % 2 == 1) {
                System.out.println(bilangan+ " Termasuk Bilangan Prima");
            }
            else if (bilangan % 2 == 0) {
                System.out.println(bilangan + " Bukan Termasuk Bilangan Prima");
            }
        }
        else {
            System.out.println(bilangan+ " Bukan Termasuk Bilangan Prima");
        }
    }
}
