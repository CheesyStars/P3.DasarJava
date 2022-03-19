public class SoalLatihan5 {
    public static void main(String[] args) {
        //Membuat Variabel Dan Array
        char huruf [] = {'p','e','m','r','o','g','r','a','m','a','n','b','e','r','b','a','s','i','s','o','b','y','e','k'};
        int jmlh = 0;

        //Perulangan For
        for (int i=0; i< huruf.length; i++) {
            if (huruf [i] == 'a') {
                jmlh +=1;
            }
        }
        System.out.println("Jumlah Huruf a Pada Array : " +jmlh);
    }
}
