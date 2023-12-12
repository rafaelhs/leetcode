package org.example.studyPlan;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        int total = 0;
        Map<Character, Integer> hash = new HashMap<>();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);
        for(int i = 0; i < s.length(); i++) {
            total+= hash.get(s.charAt(i));
            if(i > 0 && hash.get(s.charAt(i)) > hash.get(s.charAt(i-1))) {
                total -= 2*hash.get(s.charAt(i-1));
            }
        }
        return total;
    }
}
