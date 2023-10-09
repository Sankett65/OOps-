package com.bridgelabz.oops1;

public class Array {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target=8;
       int[] arr= find(nums,target);
       for (int i =0;i<arr.length;i++) {
           System.out.println(arr[i]);
       }
       // find1(nums,target);
    }



    private static int[] find(int[] nums, int target) {
        for (int i =0;i<nums.length;i++){
            if (nums[i]==target){
                System.out.println(i);

            }
        }
        return null;
    }
}
