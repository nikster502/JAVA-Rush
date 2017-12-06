package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int[] a1  =new int[10];
        int[] a2  =new int[10];
        int c =0;
        int v =0;
        for (int i: array){
            if (c<10)
            {
                a1[c] = i;
                c++;
            }
            else
            {
                a2[v] = i;

                v++;
            }

        }
       for (int i : a2){
           System.out.println(i);
       }

    }

}
