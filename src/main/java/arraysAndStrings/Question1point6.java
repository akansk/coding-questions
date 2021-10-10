package arraysAndStrings;

public class Question1point6 {
    public static void main(String[] args) {
        String s1 = "aabcccccaaa";
        System.out.println("the computed String is : " + stringCompression(s1));
    }

    private static String stringCompression(String s1) {
        if (s1.length() <= 1) {
            return s1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s1.length() - 1; i++) {
            if (!(s1.charAt(i) == s1.charAt(i + 1))) {
                stringBuilder.append(s1.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        stringBuilder.append(s1.charAt(s1.length() -1 )).append(count);
        return (stringBuilder.length() > s1.length()) ? s1 : stringBuilder.toString() ;
    }

}
