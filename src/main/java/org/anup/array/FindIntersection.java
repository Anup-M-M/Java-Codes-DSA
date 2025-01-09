package main.java.org.anup.array;

import java.util.*;

//Intersection of two arrays is an array containing distinct common elements between the two arrays
public class FindIntersection {
    public static void main(String[] args) {
        int[] a = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] b = {5, 10, 10, 15, 30};
       // List<Integer> res = intersectionV1(a, b);
        List<Integer> res = intersectionV2(a, b);

        System.out.println(res);
    }

    // Using Merge Step of Merge Sort - O(n+m) Time and O(1) Space
    private static List<Integer> intersectionV2(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        int m = a.length;
        int n = b.length;

        // This is similar to merge of merge sort
        int i = 0, j = 0;
        while (i < m && j < n) {

            // Skip duplicate elements in the first array
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }

            // Skip the smaller
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
            // If equal, add to result and move both
            else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        return res;
    }

    //O(n*m) Time and O(1) Space
    private static List<Integer> intersectionV1(int[] a, int[] b) {

        List<Integer> res = new ArrayList<>();
        int m = a.length;
        int n = b.length;

        for (int i = 0; i < m; i++) {

            // Note that duplicates must be consecutive in a sorted array
            if (i > 0 && a[i - 1] == a[i])
                continue;

            // Since we are only searching distinct elements of a[] in b[] and
            // we break as soon we find a match,
            // we get only distinct elements in result
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    res.add(a[i]);
                    break;
                }
            }
        }

        return res;
    }
}
