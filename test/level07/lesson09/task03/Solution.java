package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//        ArrayList<String> list = new ArrayList<>();
//
//
//
//            list.add("мама");
//            list.add("мыла");
//            list.add("рамму");
//        int j =1;
//       for (int i =0;i<3;i++){
//           list.add(i+j,"именно");
//j++;
//       }
//
//       for (String s : list){
//           System.out.println(s);
//       }


        ArrayList<String> list = new ArrayList<String>();
        String[] names = {"мама", "мыла", "раму"};
        for(int i = 0; i<3; i++)
        {
            list.add(names[i]);
        }
        for(int i = 0; i< list.size(); i++)
        {
            System.out.println(list.get(i) + " именно");
        }

    }
}
