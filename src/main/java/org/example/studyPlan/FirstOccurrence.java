package org.example.studyPlan;

public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int neeLength = needle.length();
        for(int i = 0; i < hayLength - (neeLength - 1); i++) {
            int j = 0;
            while(j < neeLength && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }
            if(j == neeLength) return i;
        }
        return -1;
    }
}
