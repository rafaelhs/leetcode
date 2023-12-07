package org.example.studyPlan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HIndex {
    public int hIndex(int[] citations) {

        citations = Arrays.stream(citations)
                .boxed()
                .sorted(Comparator.reverseOrder()) // just use 'sorted()' for ascending order
                .mapToInt(Integer::intValue)
                .toArray();
        for(int i = 0; i < citations.length; i++) {
            if(citations[i] < i+1) return i;
        }
        return citations.length;
    }
}
