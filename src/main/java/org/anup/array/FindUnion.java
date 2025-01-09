package main.java.org.anup.array;

import java.util.*;

//Union of two arrays is an array having all distinct elements that are present in either array
public class FindUnion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9};
        int[] b = {2, 5, 7};

        //ArrayList<Integer> res = findUnionByList(a, b);

        //ArrayList<Integer> res = findUnionBySet(a, b);

        ArrayList<Integer> res = findUnion(a, b);

        System.out.println(res);
    }

    // Using Merge Step of Merge Sort - O(n+m) Time and O(1) Space
    private static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = a.length;
        int m = b.length;

        // This is similar to merge of merge sort
        int i = 0, j = 0;
        while(i < n && j < m) {

            // Skip duplicate elements in the first array
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }

            // Skip duplicate elements in the second array
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }

            // select and add the smaller element and move
            if(a[i] < b[j]) {
                res.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]) {
                res.add(b[j]);
                j++;
            }

            // If equal, then add to result and move both
            else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        // Add the remaining elements of a[]
        while (i < n) {

            // Skip duplicate elements in the first array
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            res.add(a[i]);
            i++;
        }

        // Add the remaining elements of b[]
        while (j < m) {

            // Skip duplicate elements in the second array
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            res.add(b[j]);
            j++;
        }
        return res;
    }

    //O((n+m)*(log (n+m))) Time and O(n+m) Space
    private static ArrayList<Integer> findUnionBySet(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();

        // Put all elements of a[] in st
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Put all elements of b[] in st
        for (int i = 0; i < b.length; i++)
            set.add(b[i]);

        ArrayList<Integer> res = new ArrayList<>(set);

        return res;
    }

    //O(n*m) Time and O(1) Space
    private static ArrayList<Integer> findUnionByList(int[] a, int[] b) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            // check if the element is already in the result to avoid duplicates
            if (!res.contains(a[i])) {
                res.add(a[i]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            // check if the element is already in the result to avoid duplicates
            if (!res.contains(b[i])) {
                res.add(b[i]);
            }
        }

        Collections.sort(res);

        return res;
    }
}
