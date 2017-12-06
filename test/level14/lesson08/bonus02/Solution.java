package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        int f;
        if (i<j)
        {
            f = j;
        }
        else{
            f  = i;
        }
        while (true){
            if (j%f==0&&i%f==0){
                System.out.println(f);
                break;
            }
            else f--;
        }
    }
}
