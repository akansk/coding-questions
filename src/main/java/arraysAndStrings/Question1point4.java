package arraysAndStrings;

import java.util.HashSet;
import java.util.Locale;

public class Question1point4 {
    public static void main(String[] args) {
        String s1 = "tact Coa";
        String s2 = "palindromeemor d n i l a p";
        String s3 = "palindrome";

        System.out.println("After changing s1 to URL string :" + palindromeString(s1));
        System.out.println("After changing s1 to URL string :" + palindromeString(s3));

    }

    private static boolean palindromeString(String s1) {
        String str = s1.toLowerCase();
        HashSet<Character> hashSet = new HashSet<>();

        for( int i = 0 ; i < str.length() ; i++) {
            if( str.charAt(i) ==' ') {
                continue;
            }
            if(hashSet.contains(str.charAt(i))) {
                hashSet.remove(str.charAt(i));
            }
            else
                hashSet.add(str.charAt(i));
        }
        return hashSet.size() == 1 || hashSet.size() == 0;
    }
}
