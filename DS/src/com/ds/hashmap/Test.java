package com.ds.hashmap;

public class Test
{
    public static void main(String[] args)
    {
        String s = "123";
        Integer i = new Integer(s);
       
   
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 200);
        map.put("three", 3);

        System.out.println(map);

        System.out.println(map.get("two"));

    }

}
