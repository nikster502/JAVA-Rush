package com.javarush.test.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки,
которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.

D:\copy.txt
D:\kol.txt
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
   static   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)
    {
        try
        {
        try
        {
            BufferedReader Filereader = new BufferedReader(new FileReader(reader.readLine()));
            String s;
            while ((s = Filereader.readLine()) != null)
            {
                allLines.add(s);
            }
            Filereader.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            BufferedReader Filereader2 = new BufferedReader(new FileReader(reader.readLine()));
            String s;
            while ((s = Filereader2.readLine()) != null)
            {
                forRemoveLines.add(s);

            }
            Filereader2.close();
        }
        catch (IOException ex)
        {

            System.out.println(ex.getMessage());
        }


            new Solution().joinData();

        }catch (Exception e){

        }
    }


    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
