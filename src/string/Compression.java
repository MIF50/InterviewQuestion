package string;

/*
 *   Given a string, write a function to compress it by shortening every sequence of the same character
 *   to that character followed by the number of repetitions. If the compressed string is longer than the
 *   original, you should return the original string
 *
 *   e.g.
 *   compress("a") = a
 *   compress("aaa") = a3
 *   compress("aaabbb") = a3b3
 *   compress("aaabccc") a3b1c3
 *
 * */

public class Compression {

    public static String compress(String s) {
        StringBuilder out = new StringBuilder();
        int sum = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                sum++;
            } else {
                out.append(s.charAt(i)).append(sum);
                sum = 1;
            }
        }
        out.append(s.charAt(s.length() - 1)).append(sum);
        return out.length() < s.length() ? out.toString() : s;
    }
}


//        System.out.println(Compression.compress("a"));
//        System.out.println(Compression.compress("aaa"));
//        System.out.println(Compression.compress("aaabbb"));
//        System.out.println(Compression.compress("aaabcccb"));
