package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{ static BufferedReader  file;
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true)
        {
            try
            {

                file = new BufferedReader(new FileReader(reader.readLine()));
                break;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
            try
            {

                String f;

                while ((f = file.readLine())!=null){
                    if (number(f)){
                        if (Integer.parseInt(f)%2==0){
                            list.add(Integer.parseInt(f));
                        }
                    }
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        Collections.sort(list);
        for (int i : list){
            System.out.println(i);
        }
            // напишите тут ваш код
        }

    public static boolean number(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
