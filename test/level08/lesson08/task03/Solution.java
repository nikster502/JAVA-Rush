package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus","Tom");
        map.put("Baby", "nik");
        map.put("Cat", "Cat");
        map.put("Eat", "fuf");
        map.put("Food", "kol");
        map.put("Gevey", "nikf");
        map.put("Hugs", "nikita");
        map.put("Comp", "fedia");
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {      int num=0;
        for (String s : map.keySet())
        {
            if (map.get(s).equals(name)){
                num++;
            }

        }
        return num;


        }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int num=0;
        for (String key : map.keySet())
        {
            if(key.equals(lastName)){
                num++;
            }
        }
        return num;
        //напишите тут ваш код
    }
}
