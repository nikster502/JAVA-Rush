package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1989"));
        map.put("Stallon2", new Date("JUNE 1 1988"));
        map.put("Stallon3", new Date("JUNE 1 1987"));
        map.put("Stallon4", new Date("JUNE 1 1986"));
        map.put("Stallon5", new Date("JUNE 1 1985"));
        map.put("Stallon6", new Date("DECEMBER 1 1984"));
        map.put("Stallon7", new Date("JUNE 1 1983"));
        map.put("Stallon8", new Date("SEPTEMBER 1 1982"));
        map.put("Stallon9", new Date("JUNE 1 1981"));
        map.put("Stallone", new Date("MAY 1 1980"));

        //напишите тут ваш код
return  map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator  iterator= map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = (Map.Entry<String, Date>)iterator.next();
            Date date = pair.getValue();
             if (date.getMonth()>4&&date.getMonth()<8)
                iterator.remove();

        }
        for (String s : map.keySet()){
            System.out.println(s);
        }
        }

        //напишите тут ваш код


    public static void main(String [] args){
       removeAllSummerPeople(createMap());
    }
}
