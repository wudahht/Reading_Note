package com.leetcode.BinarySearch;
//349. Intersection of Two Arrays
/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] Intersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2); //此处必须排序，否则报错，思考为什么？因为二分查找的数组必须是有序的！
        for(Integer num:nums1){
            if(binarySearch(nums2, num)){
                set.add(num);
            }
        }

        int i =0;
        int[] res = new int[set.size()];
        for(Integer num:set){
            res[i++] = num;
        }
        return res;
    }

    public boolean binarySearch(int[] nums2, int target){
        int l=0, r=nums2.length-1, mid;
        while(l <= r){
            mid = l+(r-l)/2;
            if(nums2[mid] == target){
                return true;
            }
            else if(nums2[mid] > target){
                r = mid-1;
            }
            else {
                l = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = new Intersection().Intersection(nums1,nums2);
//        for(Integer num:res){
//            System.out.print(num+" ");
//        }
        System.out.println(Arrays.toString(res));

    }
}
