package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

      byte[] buffer = new byte[file1.available()];
       int count = file1.available();
       int count2 = file1.available()%2==0? file1.available()/2: file1.available()/2+1;
       int count3 = count - count2;
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
file1.read(buffer);
file2.write(buffer ,0 , count2);
file3.write(buffer ,count2 , count3);

        file1.close();
        file2.close();
        file3.close();
        reader.close();
    }
}
