//Mengimport Dari Library Java
import java.util.Scanner;

public class SoalLatihan9 {
    public static void main(String[] args) {
        //Membuat Variabel Dan Scanner;
        Scanner scan = new Scanner (System.in);
        String kalimat1,kalimat2;

        //Mengambil Inputan Dari User
        System.out.print("String Nama Pertama : ");
        kalimat1 = scan.nextLine();
        System.out.print("String Nama Kedua : ");
        kalimat2 = scan.nextLine();

        String[] kata1 = kalimat1.split(" ");
        String[] kata2 = kalimat2.split(" ");

        System.out.print("\n");

        System.out.print("String Nama Pertama : ");
        System.out.print(kata1[0]+ " " +kata2[2] + "\n");
        System.out.print("String Nama Kedua : ");
        System.out.print(kata2[0]+ " " +kata2[1]+ " " +kata1[1]);

    }
}
