package org.example.studyPlan;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String split[] = s.split(" ");
        return split[split.length-1].length();
    }
}
