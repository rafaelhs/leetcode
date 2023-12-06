package org.example.studyPlan;

import java.util.Arrays;
import java.util.Hashtable;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
