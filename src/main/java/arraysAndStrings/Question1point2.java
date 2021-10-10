package arraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;

public class Question1point2 {
    public static void main(String[] args) {
        String s1 = "azay";
        String s2 = "saaayz";

        System.out.println("S1 and S2 string are permutations characters:" + permutationString(s1 , s2));

    }

    private static boolean permutationString(String s1, String s2) {
        String larger = (s1.length() >= s2.length() ? s1 : s2);
        String smaller = (s2.length() <= s1.length() ? s2 : s1);
        HashSet<Character> hashSet = new HashSet<>();
        for( int i = 0 ; i < larger.length() ; i++ )
        {
            hashSet.add(larger.charAt(i));
        }

        for(int i = 0 ; i < smaller.length() ; i++ )
        {
            if( !hashSet.contains(smaller.charAt(i)))
                return false;
        }
        return true;
    }
}
