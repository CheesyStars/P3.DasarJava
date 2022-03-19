//Mengimport Dari Library Java
import java.util.ArrayList;

public class T_ArrayListExample {
    public static void main(String[] args) {
        //Membuat ArrayList
        ArrayList <String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //Mencetak ArrayList
        System.out.println(cars);

        //Mengakses Elemen ArrayList Menggunakan Konversional For
        for (int i=0; i< cars.size(); i++) {
            System.out.printf("%s",cars);
        }
        System.out.println();

        //Mengakses Elemen ArrayList Menggunakan For Each
        for (String car : cars) {
            System.out.printf("%s",car);
        }

        //Mengakses Elemen ArrayList Menggunakan Functional For Each
        cars.forEach((car)->{
            System.out.printf("%s",car);
        });
    }
}
