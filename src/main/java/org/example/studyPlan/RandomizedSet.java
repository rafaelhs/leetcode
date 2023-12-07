package org.example.studyPlan;

import java.util.*;
class RandomizedSet {
    private Set<Integer> set;
    private Random random;
    public RandomizedSet() {
        this.set = new HashSet<Integer>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        return this.set.add(val);
    }

    public boolean remove(int val) {
        return this.set.remove(val);
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(this.set);
        return list.get(this.random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */