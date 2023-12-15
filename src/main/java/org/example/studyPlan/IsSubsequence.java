package org.example.studyPlan;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int ptr = 0, i = 0;
        if(s.equals("")) return true;
        while (ptr < s.length() && i < t.length()) {
            if(t.charAt(i) == s.charAt(ptr)) {
                ptr++;
            }
            i++;
        }
        return ptr == s.length();
    }
}
