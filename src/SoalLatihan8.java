//Mengimport Dari Library Java
import java.util.Scanner;

public class SoalLatihan8 {
    //Membuat Class
    static char[] swap(String mystring, int i, int j) {
        char ch[] = mystring.toCharArray();
        char tempo = ch[i];
        ch[i] = ch[j];
        ch[j] = tempo;
        return ch;
    }

    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner
        Scanner scan = new Scanner(System.in);
        int i,j;

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scan.nextLine();

        System.out.println(swap(kalimat,0,kalimat.length()-1));
    }
}
