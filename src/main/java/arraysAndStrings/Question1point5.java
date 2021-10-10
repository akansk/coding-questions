package arraysAndStrings;

import java.util.HashMap;

// Not DONE YET

public class Question1point5 {
    public static void main(String[] args) {
        String s1 = "pales";
        String s2 = "pale";

        System.out.println("After changing s1 to URL string :" + oneAway(s1 , s2));

    }

    private static boolean oneAway(String s1, String s2) {
        boolean add = false, remove = false, replace = false ;

        if(s1.length() < s2.length()) {
            add = add(s1 , s2);
        }
        if(s1.length() > s2.length()) {
            remove = remove(s1 , s2);
        }
        if( s1.length() == s2.length() ) {
            replace = replace ( s1 , s2);
        }
        return add || remove || replace ;
    }

    private static boolean replace(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length() ; i++) {
            if( s1.charAt(i)!= s2.charAt(i))
                count+=1;
            if( count > 1)
                return false;
        }
        return count==1;
    }

    private static boolean remove(String s1, String s2) {
        HashMap<Character , Integer > hashMap =  new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++) {
            if(!hashMap.containsKey(s1.charAt(i)))
                hashMap.put(s1.charAt(i) , 1);
            else{
                int value = hashMap.get(s1.charAt(i));
                hashMap.put(s1.charAt(i) , ++value);
            }

        }
        for(int i = 0 ; i< s2.length(); i++) {
            if(hashMap.containsKey(s2.charAt(i))){
                if(hashMap.get(s2.charAt(i)) == 1)
                    hashMap.remove(s2.charAt(i));
                else {
                    int value = hashMap.get(s2.charAt(i));
                }
            }


        }
        return false;
    }

    private static boolean add(String s1, String s2) {
        return false;
    }
}
