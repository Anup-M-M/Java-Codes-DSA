package main.java.org.anup.array;

import java.util.ArrayList;

public class PrintPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printPermutations(arr, 0, new boolean[arr.length], new ArrayList<>());
    }

    private static void printPermutations(int[] arr, int position, boolean[] selected, ArrayList<Object> ans) {

        if(position == arr.length){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(selected[i] == false){
                selected[i] = true;
                ans.add(arr[i]);
                printPermutations(arr, position+1, selected, ans);
                selected[i]=false;
                ans.remove(ans.size()-1);
            }
        }
    }
}
