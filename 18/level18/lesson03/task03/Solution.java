package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    static Map<Integer,Integer> map = new HashMap<>();
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
while (fileInputStream.available()>0){
    int data = fileInputStream.read();
    map.put(data,0);
    numbers.add(data);
}
fileInputStream.close();


        for (Integer key : map.keySet())
        {int v =0;
            for (Integer f : numbers)
            {
                if (key == f){
                    map.put(key,++v );
            }
        }
        }
        for (Integer key : map.keySet()){
            if (max(map)==map.get(key))
                System.out.print( key + " ");
        }
    }
    public static Integer max(Map<Integer,Integer> array){

        for (Integer key : array.keySet()){
            Integer max = array.get(key);
        for (Integer key1 : array.keySet()){
            if (max < array.get(key1)){
                max = array.get(key1);
            }
        }
            return max;
        }
       return 1;
    }
}
