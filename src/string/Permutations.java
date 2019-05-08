package string;

/*
*   Write a function that returns all permutations of a given list.
*   permutation({1,2,3})
*
*   {1 , 2 , 3}
*   {1 , 3 , 2}
*   {2 , 1 , 3}
*   {2 , 3 , 1}
*   {3 , 1 , 2}
*   {3 , 2 , 1}
*
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {


//    public static ArrayList<String> permutations(String s){
////        ArrayList<String> results = new ArrayList<>();
////        permutation("",s,results);
////        return results;
////    }
////
////    private static void permutation (String prefix, String suffix, ArrayList<String> results){
////        if (suffix.length() == 0){
////            results.add(prefix);
////        }else {
////            for (int i = 0; i < suffix.length(); i++) {
////                permutation(prefix + suffix.charAt(i), suffix.substring(0,1) + suffix.substring(i+1),results);
////            }
////        }
////    }



    public static ArrayList<int[]> permutations(int[] a){
        ArrayList<int[]> results = new ArrayList<>();
        permutations(a, 0, results);
        return results;
    }

    private static  void permutations(int[] a, int start, ArrayList<int[]> results){
        if (start >= a.length){
            results.add(a.clone());
            System.out.println("start = " + start + "  array added to result =   " + arrayString(a));
        }else {
           for (int i = start; i < a.length; i++){
               System.out.println("start = " + start + "  a = " + arrayString(a) + "  i = " + i);
               swap(a, start, i);
               permutations(a, start + 1, results);
               swap(a, start, i);
               System.out.println("swap back between start " + start + " and i = " + i);
           }
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static String arrayString(int [] a){
        return Arrays.toString(a.clone());
    }



}
