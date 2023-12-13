package org.example.studyPlan;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] split = s.trim().split(" ", -1);
        String res = split[split.length-1];
        for(int i = split.length-2; i >= 0; i--) {
            res += " " + split[i];
        }
        return res;
    }
}
