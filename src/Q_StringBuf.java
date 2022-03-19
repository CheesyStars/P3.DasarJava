public class Q_StringBuf {
    public static void main(String[] args) {
        //Membuat Variabel
        String str = "Java";
        StringBuffer buffer = new StringBuffer(str);

        //Percabangan If Else
        if (str.equals(buffer)) {
            System.out.println("Both Are Equal");
        }
        else {
            System.out.println("Both Are Not Equal");
        }
    }
}
