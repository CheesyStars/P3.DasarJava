//Mengimport Dari Library Java
import java.util.Scanner;

public class SoalLatihan6 {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner;
        Scanner scan = new Scanner(System.in);
        String kalimat = "Politeknik Negeri Bengkalis";

        char[] huruf = new char[kalimat.length()];
        huruf = kalimat.toCharArray();

        System.out.println("Karakter e Terdapat Di Indeks Ke : ");

        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] == 'e') {
                System.out.print(i+ ", ");
            }
        }
    }
}