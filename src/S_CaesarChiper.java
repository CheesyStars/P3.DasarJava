public class S_CaesarChiper {
    public static void main(String[] args) {
        //The Caesar Cipher
        //Variabel Initialization
        String s = "blackholesarewheregoddividedbyzero";
        System.out.printf("Original Messege : %s\n",s);
        String message = "";
        int shift = 1;
        //Convert From String to charArray
        char arrayStr [] = s.toCharArray();

        //Loop Iterating Over Character
        //Perulangan For
        for (char c :arrayStr) {
            int i =(int) c;
            i += shift;
            //Percabangan If
            if (i > ((int)'z')) {
                i -= 26;
            }
            char newChar = (char) i;
            message += newChar;
        }

        //Mencetak Hasil
        System.out.printf("Encrypted Message : %s\n",message);
    }
}
