public class M_StringCompare {
    public static void main(String[] args) {
        //Membandingkan 2 Buah String
        String str1 = "POLBENG";
        String str2 = "polbeng";

        //Menampilkan Hasil
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        //Percabangan If Else
        if (s1 == s2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        if (s1 == s3) {
            System.out.println("Equel");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
