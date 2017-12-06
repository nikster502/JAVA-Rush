package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id,
и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(read.readLine()));
    String s ;
    String v = args[0];
        while ((s =reader.readLine())!=null)
        {
            String num="";
            char[] d = s.trim().toCharArray();
            for (int i=0;i<d.length;i++)
            {
                if (isInt(d[i])){
                    num +=String.valueOf(d[i]);
                }
                else
                    break;
            }

            int i = Integer.parseInt(num);

            if (Integer.parseInt(num) == Integer.parseInt(v))
                System.out.println(s);
        }
        reader.close();
        read.close();
}
    public  static boolean isInt(char s){
        try{

            int i = Integer.parseInt(String.valueOf(s));
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
