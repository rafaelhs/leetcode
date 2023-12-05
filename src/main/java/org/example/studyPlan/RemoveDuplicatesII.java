package org.example.studyPlan;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(uniqueIndex < 1
                    || nums[uniqueIndex] > nums[uniqueIndex - 1]
                    || nums[uniqueIndex] < nums[i])
            {
                nums[++uniqueIndex] = nums[i];
            }
        }
        return ++uniqueIndex;
    }
}
