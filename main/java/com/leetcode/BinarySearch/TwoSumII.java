package com.leetcode.BinarySearch;

import java.util.Arrays;

//167. Two Sum II - Input array is sorted
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2]; //默认初始化为[0, 0]
        int l=0, r = numbers.length-1;
        while(l < r){
            int s = numbers[l]+numbers[r];
            if (s == target){
                res[0] = l+1;
                res[1] = r+1;
                return res;
            }
            else if(s>target){
                r --;
            }
            else{
                l ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] res = new TwoSumII().twoSum(numbers,target);
        System.out.println(Arrays.toString(res));
    }

}
