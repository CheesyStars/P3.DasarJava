//Mengimport Dari Library Java
import java.util.ArrayList;

public class V_ArrayListObjek {
    public static void main(String[] args) {
        //Membuat Objek ArrayList
        ArrayList kantongAjaib = new ArrayList();

        //Mengisi Kantong Ajaib Dengan 5 Benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        //Menghapus Tikus Dari Kantong Ajaib
        kantongAjaib.remove("tikus");

        //Menampilkan isi Kantong Ajaib
        System.out.println(kantongAjaib);

        //Menampilkan Banyak Isi Kantong Ajaib
        System.out.println("Kantong Ajaib Berisi : " +kantongAjaib.size() + " Item");
    }
}
