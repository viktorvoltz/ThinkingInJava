package com.viktorvoltz;
import java.util.*;

public class Exercise19 {
    public static void main(String[] args) {
        String fileName = "wordcounter.java";

        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        SinpleHashMap<String, Integer> wordcount = new SimpleHashMap<String, Integer>();

        ArrayList<String> fileList = new TextFile(fileName, "\\W+");

        for(String s: words){
            int count = 0;
            for(String t : fileList){
                if(t.equals(s)) count++;
            }
            wordcount.put(s, count);
        }
        System.out.println(wordcount);
    }
}
