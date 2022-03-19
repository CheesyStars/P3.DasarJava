//Mengimport Dari Library Java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class U_ArrayListSorted {
    public static void main(String[] args) {
        //Membuat ArrayList
        ArrayList <Integer> myNumbers = new ArrayList<>();
        myNumbers.add(20);
        myNumbers.add(15);
        myNumbers.add(25);
        myNumbers.add(10);
        printList(myNumbers);

        //Sort myNumbers Ascending Order
        Collections.sort(myNumbers);
        printList(myNumbers);

        //Sort myNumbers Descending Order
        Collections.sort(myNumbers,Collections.reverseOrder());
        printList(myNumbers);
    }
    //Membuat Class
    static void printList (ArrayList<Integer>myNumbers) {
        myNumbers.forEach((number) ->{
            System.out.printf("%d",number);
        });
        System.out.println();
    }
}
