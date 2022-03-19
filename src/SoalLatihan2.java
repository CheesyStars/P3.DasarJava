//Import Dari Libarry Java
import java.util.Scanner;

public class SoalLatihan2 {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        Scanner scan = new Scanner(System.in);
        int bil_input, tot_prev, bil1 = 0, bil2 = 1;

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Jumlah Deretan Fibonacci? ");
        bil_input = scan.nextInt();

        //Melakukan Perulangan For
        for (int i = 0; i <= bil_input; i++) {
            tot_prev = bil1 + bil2;
            bil2 = bil1;
            bil1 = tot_prev;

            //Mencetak Hasil
            System.out.print(" " + tot_prev);
        }

    }
}
