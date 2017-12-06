package com.javarush.test.level18.lesson10.home02;


import java.io.FileInputStream;
import java.io.IOException;



/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {

    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count =0;
        int countAll =0;
        while (fileInputStream.available()>0){
            int i = fileInputStream.read();
                countAll++;
            if (" ".equals(String.valueOf((char)i))){
                count++;
            }
        }
        System.out.printf("%.2f",(double)count/countAll*100);
        fileInputStream.close();
    }
}
