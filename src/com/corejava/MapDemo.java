package com.corejava;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        /*HashMap<String,Integer> map=new HashMap<>();
        map.put("key1",456);
        map.put("Str1",417);
        map.put("Key2",963);
        map.put("Ram",125);
        map.put("Kumar",752);
        //System.out.println(map.containsKey("741"));
       // System.out.println(map.keySet());
        //System.out.println(map.values());
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            if(entry.getKey().equals("Str1"))
                entry.setValue(965);
            System.out.println(entry);
        }
        System.out.println(map);*/
        /*LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("key1",456);
        map.put("Str1",417);
        map.put("Key2",963);
        map.put("Ram",125);
        map.put("Kumar",752);
        System.out.println(map);*/
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("key1",456);
        map.put("Str1",417);
        map.put("Key2",963);
        map.put("Ram",125);
        map.put("Kumar",752);
        System.out.println(map);
        ArrayList<String> list=new ArrayList<>();
        list.add("Str1");
        list.add("Str1");
        list.add("Str1");
        list.add("Str1");
        list.sort();
    }

}
