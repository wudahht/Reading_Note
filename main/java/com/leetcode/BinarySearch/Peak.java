package com.leetcode.BinarySearch;
//852. Peak Index in a Mountain Array
/*
Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1
Example 2:

Input: [0,2,1,0]
Output: 1
Note:

3 <= A.length <= 10000
0 <= A[i] <= 10^6
A is a mountain, as defined above.
 */

public class Peak {
    public int peakIndexInMountainArray(int[] A) {
        int l=0, r=A.length-1, mid;
        while(l < r){   //思考为什么不能等于
            mid = l + (r - l)/2;
            if(A[mid] < A[mid+1]){ //思考为什么不能等于
                l = mid;
            }
            else if(A[mid-1] > A[mid]){   //思考为什么不能等于
                r=mid;
            }
            else {return mid;}
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int[] A = {0,3,5,6,4,2,1,0};
        Peak peak = new Peak();
        System.out.println(peak.peakIndexInMountainArray(A));
    }

}
