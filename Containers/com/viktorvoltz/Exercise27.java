package com.viktorvoltz;

import java.util.*;

/**
 * @author viktorvoltz
 */

public class Exercise27 {
    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0;

    public Exercise27(String str) {
        s = str;
        created.add(s);
        // id is the total number of instances
        // of this string in use by CountedString:
        for (String s2 : created)
            if (s2.equals(s))
                id++;
    }

    public String toString() {
        return "String: " + s + " id: " + id +
                " hashCode(): " + hashCode();
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        // result = 37 * result + id;
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof Exercise27 &&
                s.equals(((Exercise27) o).s) &&
                id == ((Exercise27) o).id;
    }

    public static void main(String[] args) {
        Map<Exercise27, Integer> map = new HashMap<Exercise27, Integer>();
        Exercise27[] cs = new Exercise27[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new Exercise27("hi");
            map.put(cs[i], i); // Autobox int -> Integer
        }
        System.out.println(map);
        // Problem: same hash code for different objects:
        for (Exercise27 cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }
    }
}