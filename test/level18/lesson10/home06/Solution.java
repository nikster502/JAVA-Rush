package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        TreeMap<Character,Integer> map = new TreeMap<>();
        ArrayList<Character> list = new ArrayList<>();

        while (fileInputStream.available()>0){
            int i = fileInputStream.read();

            if ( (i>0 && i<128)){
                map.put((char)i , 0);
            }
            list.add((char)i);
        }

        for (Character s : map.keySet()){
            int i =0;
            for (Character l : list){
if (s == l){
    map.put(s , ++i);
}
            }
        }
        for (Character s : map.keySet()){
            System.out.println(s +" "+  map.get(s));
        }
        fileInputStream.close();
    }
}
