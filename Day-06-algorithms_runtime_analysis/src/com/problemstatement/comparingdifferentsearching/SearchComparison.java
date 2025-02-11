package com.problemstatement.comparingdifferentsearching;

import java.util.*;

public class SearchComparison {

    // Linear Search in an Array (O(N))
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // Search in HashSet (O(1) on average)
    public static boolean hashSetSearch(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Search in TreeSet (O(log N))
    public static boolean treeSetSearch(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }
}
