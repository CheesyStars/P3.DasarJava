//Mengimport Dari Library Java
import java.util.HashMap;
import java.util.Map;

public class Y_BukuHashMap {
    public static void main(String[] args) {
        //Membuat Objek Hashmap
        HashMap <String , X_Buku> books = new HashMap<>();

        //Membuat Onjek Buku
        X_Buku bukuJava = new X_Buku("Tutorial Java","Petani Kode");
        X_Buku bukuKotlin = new X_Buku("Pemrograman Kotlin","Petani Kode");
        X_Buku bukuAndroid = new X_Buku("Pemrograman Android","Petani Kode");

        //Mengisi Objek Hashmap Dengna Objek Buku
        books.put("java",bukuJava);
        books.put("Kotlin",bukuKotlin);
        books.put("Android",bukuAndroid);

        //Print Keys
        System.out.println("\nDaftar Key : ");
        //Perulangan For
        for (String i : books.keySet()) {
            System.out.println(i);
        }

        //Print Values
        System.out.println("\n Daftar Values : ");
        for (X_Buku aBook : books.values()) {
            System.out.println("Title : " +aBook.getTitle()+ ", Author : " +aBook.getAuthor());
        }

        //Cetak Semua Buku
        for (Map.Entry b : books.entrySet()) {
            X_Buku buku = (X_Buku) b.getValue();
            System.out.println(b.getKey()+ ": " +buku.getTitle());
        }
    }
}
