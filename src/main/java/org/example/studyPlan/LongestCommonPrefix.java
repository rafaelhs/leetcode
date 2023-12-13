package org.example.studyPlan;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int length = strs[0].length();
        int last = strs.length-1;
        for(int i = 0; i < length; i++) {
            if(strs[0].charAt(i) != strs[last].charAt(i)) return strs[0].substring(0, i);
        }
        return strs[0];
    }
}
