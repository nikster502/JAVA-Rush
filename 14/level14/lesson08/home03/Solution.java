package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution implements Person
{
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        ArrayList<String> ulcp = new ArrayList<>();
        ulcp.add("user");
        ulcp.add("looser");
        ulcp.add("coder");
        ulcp.add("proger");
        while (true)
        {
            key = reader.readLine();
            if (key.equals("user") || key.equals("looser") || key.equals("coder") || key.equals("proger"))
                list.add(key);
            else break;
        }
        {
            ArrayList<Person> obj = new ArrayList<>();
            for (String s : list)
            {
                if (s.equals("user"))
                {
                    person = new User();
                    doWork(person);
                } else if (s.equals("looser"))
                {
                    person = new Looser();
                    doWork(person);
                }
                else if (s.equals("coder"))
                {
                    person = new Coder();
                    doWork(person);
                }
                else if (s.equals("proger"))
                {
                    person = new Proger();
                    doWork(person);
                }
            }
        }}

    public static void doWork(Person person)
    {
        if (person instanceof Person.User)
        {
            ((User) person).live();
        } else if (person instanceof Looser)
        {
            ((Looser) person).doNothing();
            // пункт 3
        } else if (person instanceof Coder)
        {
            ((Coder) person).coding();
            // пункт 3
        } else if (person instanceof Looser)
        {
            ((Looser) person).doNothing();
            // пункт 3
        } else if (person instanceof Proger)
        {
            ((Proger) person).enjoy();
            // пункт 3
        } else System.out.println("ПИдар");

    }
}


