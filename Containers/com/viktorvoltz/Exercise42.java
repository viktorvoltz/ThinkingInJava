package com.viktorvoltz;

import java.util.*;

class TwoStrings42 implements Comparable<TwoStrings42> {
    private String first = "";
    private String second = "";

    public TwoStrings42(String s1, String s2) {
        first = s1;
        second = s2;
    }

    // Using only first String to compare:
    public int compareTo(TwoStrings42 ts) {
        return first.compareToIgnoreCase(ts.first);
    }

    // Optional inner class to use second String to compare:
    public static class Comp2 implements Comparator<TwoStrings42> {
        public int compare(TwoStrings42 ts1, TwoStrings42 ts2) {
            return ts1.second.compareToIgnoreCase(ts2.second);
        }
    }

    public String toString() {
        return first + " & " + second;
    }

    static void printArray(TwoStrings42[] sa) {
        System.out.print("(");
        for (int i = 0; i < sa.length - 1; i++)
            System.out.print(sa[i] + ", ");
        System.out.println(sa[sa.length - 1] + ")");
    }

    public static void main(String[] args) {
        RandomGenerator.String rgs = new RandomGenerator.String(4);
        TwoStrings42[] array = new TwoStrings42[5];
        List<TwoStrings42> list = new ArrayList<TwoStrings42>();
        for (int i = 0; i < array.length; i++) {
            String s1 = rgs.next();
            String s2 = rgs.next();
            array[i] = new TwoStrings42(s1, s2);
            list.add(new TwoStrings42(s1, s2));
        }
        System.out.print("Array: ");
        printArray(array);
        System.out.println("List: " + list);
        Arrays.sort(array);
        Collections.sort(list, null);
        System.out.println();
        System.out.println("Sorted by first word:");
        System.out.print("Array: ");
        printArray(array);
        System.out.println("List: " + list);
        TwoStrings42.Comp2 comp = new TwoStrings42.Comp2();
        Arrays.sort(array, comp);
        Collections.sort(list, comp);
        System.out.println();
        System.out.println("Sorted by second word:");
        System.out.print("Array: ");
        printArray(array);
        System.out.println("List: " + list);
    }
}
