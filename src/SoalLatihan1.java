//Mengimport Dari Library Java
import java.text.NumberFormat;

public class SoalLatihan1 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        //Membuat Array Dan Variabel
        int nilai [][] = new int[4][3];

        //Memberi Nilai Pada Array
        nilai [0][0] = 81;
        nilai [0][1] = 90;
        nilai [0][2] = 62;
        nilai [1][0] = 50;
        nilai [1][1] = 83;
        nilai [1][2] = 87;
        nilai [2][0] = 89;
        nilai [2][1] = 55;
        nilai [2][2] = 65;
        nilai [3][0] = 77;
        nilai [3][1] = 70;
        nilai [3][2] = 92;

        System.out.println("NRP\tRata - Rata");
        System.out.println("------------------------");

        double ratarata [] = new double[nilai.length];

        //Mencari Nilai Rata - rata Dengan Perulangan For
        for (int i=0; i< nilai.length; i++) {
            for (int j=0; j< nilai[0].length; j++) {
                ratarata [i] += nilai [i][j];
            }
            ratarata [i] /= nilai [0].length;
            System.out.print((i+1)+ "\t ");
            System.out.print(nf.format(ratarata[i])+ "\n");
        }
        System.out.println("------------------------");
    }
}
