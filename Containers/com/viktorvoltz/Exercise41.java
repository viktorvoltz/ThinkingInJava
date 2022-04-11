package com.viktorvoltz;

import java.util.*;

class TwoStrings41 implements Comparable<TwoStrings41> {
	private String first = "";
	private String second = "";
	public TwoStrings41(String s1, String s2) {
		first = s1;
		second = s2;
	}
	// Using only first String to compare:
	public int compareTo(TwoStrings41 ts) {
		return first.compareTo(ts.first);
	}
	// Optional inner class to use second String to compare:
	public static class Comp2 implements Comparator<TwoStrings41> {
		public int compare(TwoStrings41 ts1, TwoStrings41 ts2) {
			return ts1.second.compareTo(ts2.second);
		}
	}
	public String toString() {
		return first + " & " + second;
	}
	static void printArray(TwoStrings41[] sa) {
		System.out.print("(");
		for(int i = 0; i < sa.length - 1; i++) 
			System.out.print(sa[i] + ", ");
		System.out.println(sa[sa.length - 1] + ")");		
	}
	public static void main(String[] args) {
		RandomGenerator.String rgs = new RandomGenerator.String(4);
		RandomGenerator.Integer rgi = new RandomGenerator.Integer(100);
		Set<TwoStrings41> set = new HashSet<TwoStrings41>();
		Map<TwoStrings41,Integer> map = new HashMap<TwoStrings41,Integer>();
		for(int i = 0; i < 4; i++) {
			String s1 = rgs.next();
			String s2 = rgs.next();
			set.add(new TwoStrings41(s1, s2));
			map.put(new TwoStrings41(s1, s2), rgi.next());
		}
		System.out.println("Set: " + set);
		System.out.println("Map: " + map);
		System.out.println("map.keySet(): " + map.keySet());
		System.out.println("Sorted by first String:");
		Set<TwoStrings41> treeSet = new TreeSet<TwoStrings41>(set);
		Map<TwoStrings41,Integer> treeMap = 
			new TreeMap<TwoStrings41,Integer>(map);
            System.out.println("TreeSet: " + treeSet);
            System.out.println("TreeMap: " + treeMap);
            System.out.println("Sorted by second String:");
		TwoStrings41.Comp2 comp = new TwoStrings41.Comp2();
		Set<TwoStrings41> treeSet2 = 
			new TreeSet<TwoStrings41>(comp);
		Map<TwoStrings41,Integer> treeMap2 = 
			new TreeMap<TwoStrings41,Integer>(comp);
		treeSet2.addAll(treeSet);
		treeMap2.putAll(treeMap);
		System.out.println("TreeSet2: " + treeSet2);
		System.out.println("TreeMap2: " + treeMap2);		
	}
}