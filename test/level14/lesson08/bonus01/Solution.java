package com.javarush.test.level14.lesson08.bonus01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   ArrayList<String> list =new ArrayList<>();
        try
        {

            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
            exceptions.add(new ArithmeticException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new SecurityException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new ArithmeticException());
            exceptions.add(new IllegalMonitorStateException());
            exceptions.add(new NullPointerException());
            exceptions.add(new IndexOutOfBoundsException());


        }


        //Add your code here

    }
}
