package com.intrview.programs;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class HashMapSorting {
 
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Entry<String, Integer>> set = map.entrySet();
        System.out.println(set);
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        System.out.println(list);
//        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
//        {
//            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
//            {
//                return (o2.getValue()).compareTo( o1.getValue() );
//            }
//        } );
        Collections.sort(list,new HashMapComparator());
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
    }
}