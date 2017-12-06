package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/


import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileWriter fileWriter = new FileWriter(s);
        ArrayList<String> list = new ArrayList<>();
        String lineSeparator = System.lineSeparator();
        while (true){
            String s1 = reader.readLine();
            list.add(s1);
            if (s1.equals("exit")) break;
        }
        for (String l : list){
            fileWriter.write(l);
            fileWriter.write(lineSeparator);
        }
        fileWriter.close();
        reader.close();
    }
}
