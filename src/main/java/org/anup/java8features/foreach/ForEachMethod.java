package main.java.org.anup.java8features.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// forEach method is fast and efficient.
public class ForEachMethod {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,6,7,8);

        nums.forEach(n -> System.out.println(n));

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer num) {
//                System.out.println(num);
//            }
//        };
//
//        nums.forEach(con);

        //External for loops
//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }

        //External for loops or Enhanced for loop
//        for(int i: nums){
//            System.out.println(i);
//        }

    }
}
