package org.example.studyPlan;

public class TrappingRainWater {
    public int trap(int[] height) {
        int volume = 0, leftHight = 0, rightHight = 0;
        int lIndex = 0, rIndex = height.length-1;

        while(lIndex < rIndex) {
            if(leftHight < height[lIndex]) leftHight = height[lIndex];
            if(rightHight < height[rIndex]) rightHight = height[rIndex];

            if(leftHight < rightHight) {
                volume += leftHight - height[lIndex++];
            } else {
                volume += rightHight - height[rIndex--];
            }
        }
        return volume;
    }
}
