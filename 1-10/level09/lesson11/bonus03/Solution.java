package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> listI = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

       for (int i =0;i<array.length;i++){
           if(isNumber(array[i])){
               listI.add(Integer.parseInt(array[i]));
           }
           else
               list1.add(array[i]);
       }

        for (int j =listI.size()-1;j>0;j--){
            for (int i =0;i<j;i++) {
           if (listI.get(i) < listI.get(i+1))
           {
              int max = listI.get(i);
               listI.remove(i);
               listI.add(i,listI.get(i+1));
               listI.remove(i);
               listI.add(i+1,max);
           }
       }
       }
       String s;
        for (int j =list1.size()-1;j>=0;j--)
        {for (int i = 0; i <= j; i++)
            {
if (isGreaterThan(list1.get(i),list1.get(j))){
    s = list1.get(j);
    list1.remove(j);
    list1.add(j,list1.get(i));
    list1.remove(i);
    list1.add(i,s);
}
            }

        }

       int k=0;
        int n =0;
       for (int i =0;i<array.length;i++){
if (isNumber(array[i])){
    array[i]=String.valueOf(listI.get(k++));
}
else
    array[i] = list1.get(n++);

       }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
