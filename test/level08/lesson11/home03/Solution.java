package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
       HashMap<String,String> map = new HashMap<>();
        map.put("Stallone1","JUNE11989");
        map.put("Stallon", "JUNE");
        map.put("Stallon3", "JUNE");
        map.put("Stallon4", "JUNE");
        map.put("Stallon5", "JUNE 1 1985");
        map.put("Stallon", "DECEMBER 1 1984");
        map.put("Stallon", "JUNE 1 1983");
        map.put("Stallon8","SEPTEMBER 1 1982");
        map.put("Stallon9","JUNE11981");
        map.put("Stallone", "MAY1980");
        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
