package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }
        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
int[] array = new int[33];

        for (int i=0;i<list.size();i++){
        for (int j=0;j<list.get(i).length();j++){
            for (int k =0;k<array.length;k++){
                String s = String.valueOf(list.get(i).charAt(j));
                String ar = String.valueOf(abcArray[k]);
                if (s.equals(ar)){
                    array[k]++;
                }
            }
        }
        }
      for (int i=0;i<array.length;i++){
          System.out.println(abcArray[i]+" "+ array[i]);
      }
        //напишите тут ваш код
    }

}
