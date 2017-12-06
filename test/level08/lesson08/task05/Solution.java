package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("Stallone1","JUNE1");
        map.put("Stallon2", "JUNE");
        map.put("Stallon3", "JUNE");
        map.put("Stallon4", "JUNE");
        map.put("Stallon5", "JUNE 1 1985");
        map.put("Stallon6", "DECEMBER 1 1984");
        map.put("Stallon7", "JUNE 1 1983");
        map.put("Stallon8","SEPTEMBER 1 1982");
        map.put("Stallon9","JUNE1");
        map.put("Stallone", "MAY1980");
        return map;
    }
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> t= new ArrayList<String>();
        for(Map.Entry<String, String>pair:map.entrySet())
        {
            String value = pair.getValue();
            t.add(value);
        }
        ArrayList<String> h=t;
        ArrayList<String> v= new ArrayList<String>();
        for(int i=0;i<t.size(); i++)
        {
            for(int a=1; a<t.size();a++)
            {
                if(h.get(i)==t.get(a))
                    v.add(h.get(i));
            }
        }
        for(int i=0;i<v.size(); i++)
        {
           removeItemFromMapByValue(map, v.get(i));
        }
        for (Map.Entry<String, String> pair: map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        String key="";
        int e=0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if ((pair.getValue().equals(value)&&(e==0))){
                e++;
                key=pair.getKey();
            }else if ((pair.getValue().equals(value))&&(e>0))
            {
                map.remove(key);
                map.remove(pair.getKey());
            }
        }
    }
    public static  void main (String [] args){
        removeTheFirstNameDuplicates(createMap());
    }
}
