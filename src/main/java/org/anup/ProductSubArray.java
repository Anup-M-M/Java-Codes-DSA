package main.java.org.anup;

public class ProductSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,5,0,-3,-2,-4};

        int result = product(nums);

        System.out.println(result);
    }

    private static int product(int[] nums) {
        if(nums == null || nums.length == 0){
            return  0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length ; j++) {
                product *= nums[j];
                max = Math.max(max , product);
            }
        }
        return  max;
    }
}
