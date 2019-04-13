package string;

/*
 *   Given two strings, write a function to determine whether they are anagrams
 *   BANANA
 *   banana
 *   O(m+n)
 * */
public class Anagrams {

    public static boolean isAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[1 << 8];  // 1<<8 is 1 byte or 256

        for (char c : s1.toCharArray()) {
            letters[c]++;
            System.out.println("the first world - " + c + letters[c]);
        }
        for (char c : s2.toCharArray()) {
            letters[c]--;
            System.out.println("the second world - " + c + letters[c]);
        }

        for (int i : letters) {
            if (i != 0) return false;
        }
        return true;
    }

}
//        boolean value = Anagrams.isAnagrams("BANANA","banana");
//        System.out.println(value);
