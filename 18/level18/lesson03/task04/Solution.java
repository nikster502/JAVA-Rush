package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    static Map<Integer,Integer> map = new HashMap<>();
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            map.put(data, 0);
            numbers.add(data);
        }
        fileInputStream.close();
        for (Integer key : map.keySet())
        {
            int v = 0;
            for (Integer i : numbers)
            {
if (key == i){
    map.put(key , v++);
}
            }
        }

for (Integer key : map.keySet()){
    if (minX(map) == map.get(key)){
        System.out.print(key +" ");
    }
    }

    }

    public static Integer minX(Map<Integer,Integer> map){
        for (Integer key : map.keySet()){
            int min = map.get(key);
        for (Integer i : map.keySet()){
if (min> map.get(i)){
    min = map.get(i);
}
        }
        return min;
        }
        return 1;
    }
}
