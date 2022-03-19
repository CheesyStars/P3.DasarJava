import java.util.Locale;

public class SoalLatihan7 {
    public static void main(String[] args) {
        //Membuat Variabel
        String kalimat = "Selamat Datang di POLBENG";

        //Mengkonversikan Ke Huruf Kapital
        String kalimatUp = kalimat.toUpperCase();
        String kalimatLow = kalimat.toLowerCase();

        //Menampilkan Hasil
        System.out.println("Kalimat Dalam Huruf Besar Semua : " +kalimatUp);
        System.out.println("Kalimat Dalam Huruf Kecil Semua : "+kalimatLow);

        int jumlahKalimat = kalimat.length();
        System.out.println("Panjang Kalimat : " +jumlahKalimat);

        String hurufKecil = "abcdefghijklmnopqrstuvwxyz";
        String hurufBesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char c [] = kalimat.toCharArray();

        System.out.println("Huruf Kecil : ");
        for (int i=0; i<c.length; i++) {
            if (hurufKecil.contains(String.valueOf(c[i]))) {
                System.out.print(c[i]+ ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Huruf Besar : ");
        for (int i=0; i<c.length; i++) {
            if (hurufBesar.contains(String.valueOf(c[i]))) {
                System.out.print(c[i]+ ", ");
            }
        }
    }
}
