public class E_ArraySatuDimensi {
    public static void main(String[] args) {
        //Membuat Variabel Array
        int nilai [] = new int [3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        double ratarata = 0;

        //Menampilkan Isi Array Menggunakan Perulangan For
        for (int i=0; i< nilai.length; i++) {
            ratarata += nilai[i];
        }
        ratarata /= nilai.length;
        System.out.println("Nilai Rata - Rata = " +ratarata);

    }
}
