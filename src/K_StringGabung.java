public class K_StringGabung {
    public static void main(String[] args) {
        //Menggabungkan 2 Buah String
        String str1 = "RPL";
        String str2 = "POLBENG";
        String str3 = str1 + str2;

        //Menampilkan Hasil
        System.out.println(str3);

        String str4 = str3.concat("2020");
        System.out.println(str4);

        str3 += str2;
        System.out.println(str3);
    }
}
