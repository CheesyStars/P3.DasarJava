public class P_StringAdd {
    public static void main(String[] args) {
        //Membuat Variabel
        String s = "Hell";
        amethod(s);
    }
    //Membuat Class
    public static void amethod (String s){
        char c = 'o';
        s += c;
        System.out.println(s);
    }
}
