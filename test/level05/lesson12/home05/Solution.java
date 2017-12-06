package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa =0;
        int i ;
        while(true)
        {
            String s = reader.readLine();
            if (s.equals("сумма"))
            {
                System.out.println(summa);
                break;
            }
            else
            {
                i = Integer.parseInt(s);
                summa +=i;
            }
        }
    }
}
