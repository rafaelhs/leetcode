package org.example.studyPlan;

public class JumpGame {
    public boolean canJump(int[] nums) {
        return lastJump(nums.length-1, nums);
    }

    public boolean lastJump(int lastIndex, int[] nums) {
        if(lastIndex == 0) return true;
        for(int i = lastIndex-1; i >= 0; i--) {
            if(nums[i] >= lastIndex - i) {
                return lastJump(i, nums);
            }
        }
        return false;
    }
}
