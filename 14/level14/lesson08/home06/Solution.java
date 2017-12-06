package com.javarush.test.level14.lesson08.home06;

/* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String s= reader.readLine();
            if (s.equals("cartoon")||s.equals("thriller")||s.equals("soapOpera"))
            list.add(s);
            else break;
        }
        for (String s : list){
            Movie movie = MovieFactory.getMovie(s);
            movie.getClass().getSimpleName();
        }
        for (String s : list){
            Movie movie = MovieFactory.getMovie(s);
            System.out.println(movie.getClass().getSimpleName());
        }

        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
                return movie;
            }
            else if ("cartoon".equals(key))
                {
                    movie = new Cartoon();
                    return movie;
                }
            else if ("thriller".equals(key))
                return new Thriller();
            else  return null;
        }
            //напишите тут ваш код, пункты 5,6


        }


    static abstract class Movie
    {
    }

    static class SoapOpera extends Movie
    {
    }
    public static class Cartoon extends Movie{

    }
    public static class Thriller extends Movie{

    }
    //Напишите тут ваши классы, пункт 3
}
