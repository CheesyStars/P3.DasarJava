import java.util.Locale;

public class R_VowelConsonant {
    public static void main(String[] args) {
        //Character Occurance In A Sentence Analysis
        //The String That We Want To Analyze
        String s = "A Programmer Gets Stuck In The Shower Because The Instruction On The Shampoo were : Lather, Wash, and Repeat";
        System.out.println(s);
        s = s.toLowerCase();

        //Counters Initialization
        int vowelCount = 0;
        int consonantCount = 0;

        //Definition Of Character Groups
        String vowels = "aeiouy";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        //Convert From String To charArray
        char [] c= s.toCharArray();

        //Main Loop
        for (int i=0; i<c.length; i++) {
            //Percabangan If Else-If
            if (vowels.contains(String.valueOf(c[i]))) {
                vowelCount++;
            }
            else if (consonants.contains(String.valueOf(c[i]))){
                consonantCount++;
            }
            //Menampilkan Hasil
            System.out.printf("Vowels : %d\n ",vowelCount);
            System.out.printf("Consonants : %d\n ",consonantCount);
            System.out.printf("Other Characters : %d\n ",(c.length - (vowelCount + consonantCount)));
        }
    }
}
