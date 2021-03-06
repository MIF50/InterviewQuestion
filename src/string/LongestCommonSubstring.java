package string;

/*
*   Given two strings, write a function that returns the longest
*   common subString.
*
*
*   eg.  substring("ABAA", "BABA")   "ABA"
*
*   "ABAB"
*    ^
*    "BABA"
*     ^
*
*       A  B  A  B
*    B [0, 1, 0 ,1]
*    A [1, 0, 2, 0]
*    B [0, 2, 0, 3]
*    A [1, 0, 3, 0]
*
*
*
* */

public class LongestCommonSubstring {

    public static String longestSubstring(String a, String b){
        String out = "";
        if (a.length() == 0 || b.length() == 0) return out;

        int [][] cache = new int[a.length()][b.length()];


        for(int i=0; i<a.length(); i++){
            for (int j=0; j<b.length(); j++){

                if(a.charAt(i) ==  b.charAt(j)){
                    if (i == 0 || j == 0){
                        cache[i][j] = 1;
                    } else{
                        cache[i][j] = cache[i-1][j-1] + 1;
                    }
                    if (cache[i][j] > out.length()){
                        int length = cache[i][j];
                        out = a.substring(i - length + 1, i + 1);
                    }
                }
            }
        }

        return out ;
    }
}
