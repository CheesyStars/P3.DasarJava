public class SoalLatihan4 {
    public static void main(String[] args) {
        //membuat Array
        int [][] arrayOfints = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};

        //Melakukan Perulangan For
        for (int i = 0; i < arrayOfints.length; i++) {
            for (int j = 0; j < arrayOfints.length; j++) {
                //Melakukan Percabangan If
                if (arrayOfints [i][j] == 12) {
                    //Mencetak Hasil
                    System.out.println("Found 12 " + "At " +i+ ", " +j);
                }
            }
        }
    }
}