package arraysAndStrings;

import java.util.HashMap;

public class Question1point1 {
    public static void main(String[] args) {
        String s1 = "sqsr";
        String s2 = "aztd";

        System.out.println("S1 string has unique characters:" + uniqueString(s1));
        System.out.println("S1 string has unique characters:" + uniqueString(s2));

        System.out.println("S1 string has unique characters :" + uniqueStringHashmap(s1));
        System.out.println("S1 string has unique characters :" + uniqueStringHashmap(s2));
    }

    private static boolean uniqueStringHashmap(String s) {
        HashMap<Character , Integer> hashMap = new HashMap<Character, Integer>();
        for( int i = 0 ; i < s.length() ; i++ )
        {
            if( hashMap.containsKey(s.charAt(i)))
            {
                return false;
            }
            else
                hashMap.put(s.charAt(i),1);
        }
        return true ;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static boolean uniqueString(String s) {

        int checker = 0;
        for(int i = 0 ; i< s.length() ; i++)
        {
            int val = s.charAt(i) - 'a';
            if( (checker & (1 << val )) > 0)
            {
                return false;
            }
            checker = checker | (1 << val);
        }
        return true ;

    }

}
