//Mengimport Dari Library Java
import java.util.HashMap;

public class W_HashMapExample {
    public static void main(String[] args) {
        //Membuat Objek HashMap
        HashMap <Integer, String> days = new HashMap<>();

        //Menigis Nilai Ke Objek Days
        days.put(1,"Minggu");
        days.put(2,"Senin");
        days.put(3,"Selasa");
        days.put(4,"Rabu");
        days.put(5,"Kamis");
        days.put(6,"Jum'at");
        days.put(7,"Sabtu");

        //Mencetak Semua Isi Dari Objek Days
        System.out.println("Isi Objek Days : " +days);
        System.out.println("Hari Kedua : " +days.get(2));

        //Mengubah Hari Minggu Menjadi Hari Ahad
        days.put(1,"Ahad");

        //Mengubah Hari Rabu Menjadi Rabo
        days.replace(4,"Rabo");

        //Mencetak Semua Isi Dari Objek Days
        System.out.println("Isi Objek Days : " +days);

        //Menghapus Malam Minggu <-- Jomblo Detected :D
        days.remove(1);

        System.out.println("Isi Objek Days : " +days);

        //Menghapus Semua Hari <-- Oh Tidak Kiamat Donk!
        days.clear();
        System.out.println("Isi Objek Days : "+days);
    }
}
