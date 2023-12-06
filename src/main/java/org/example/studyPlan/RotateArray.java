package org.example.studyPlan;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int pivot = k % nums.length;
        reverseNum(nums, 0, nums.length-1);
        reverseNum(nums, 0, pivot-1);
        reverseNum(nums, pivot, nums.length-1);
    }

    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int aux = nums[start];
            nums[start] = nums[end];
            nums[end] = aux;
            start++;
            end--;
        }
    }
}
