package org.example.studyPlan;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) stringBuilders[i] = new StringBuilder();

        for(int i = 0; i < s.length();) {
            for(int j = 0; j < numRows && i < s.length(); j++) {
                stringBuilders[j].append(s.charAt(i++));
            }
            for(int j = numRows-2; j > 0 && i < s.length(); j--) {
                stringBuilders[j].append(s.charAt(i++));
            }
        }
        String result = "";
        for(StringBuilder sb : stringBuilders) result += sb.toString();
        return result;
    }
}
