package org.example.studyPlan;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        m--;
        n--;
        while(n >= 0) {
            if(m >= 0 && nums1[m] > nums2[n]) {
                nums1[lastIndex--] = nums1[m--];
            } else {
                nums1[lastIndex--] = nums2[n--];
            }
        }

    }
}
