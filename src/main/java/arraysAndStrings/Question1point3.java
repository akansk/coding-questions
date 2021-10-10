package arraysAndStrings;

import java.util.Arrays;

public class Question1point3 {
    public static void main(String[] args) {
        String s1 = "Mr John Smith    ";

        System.out.println("After changing s1 to URL string :" + urlString(s1 , 13));
        System.out.println("After changing s1 to URL string :" + urlSameString(s1 , 13));

    }

    private static String urlSameString(String st, int length) {
        char[] str = new char[st.length()];
        for( int i = 0 ; i< st.length() ; i ++ )
        {
            str[i] = st.charAt(i);
        }

        int count = length - 1 ;
        for( int i = str.length -1 ; i>=0 ; i --)
        {
            if( count == 0)
                break;
            if( str[count] == ' ')
            {
                str[i--] = '0';
                str[i--] = '2';
                str[i] = '%';
            }
            else
            {
                str[i] = str[count];
            }
            count --;
        }
        return Arrays.toString(str);
    }

    private static String urlString(String st , int length) {
        char[] str = new char[st.length()];
        for( int i = 0 ; i< length ; i ++ )
        {
            str[i] = st.charAt(i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < length ; i++)
        {
            if(str [i] == ' ')
            {
                stringBuilder.append('%');
                stringBuilder.append('2');
                stringBuilder.append('0');
            }
            else
                stringBuilder.append(str[i]);
        }
        for( int i = 0 ; i< str.length ; i++)
        {
            str [i] = stringBuilder.charAt(i);
        }

        return Arrays.toString(str);
    }
}
