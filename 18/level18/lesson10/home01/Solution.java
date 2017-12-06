package com.javarush.test.level18.lesson10.home01;

import java.io.FileInputStream;
import java.io.IOException;


/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/



public class Solution {

    public static void main(String[] args) throws IOException
    {

        FileInputStream fileInputStream = new FileInputStream(args[0]);


//        String chars = "abcdefghijklmnopqrstuvwxyz";
//        char[] chArray = chars.toCharArray();
//        int count=0;
//        while (fileInputStream.available()>0){
//            int num = fileInputStream.read();
//
//            for (int i = 0; i<chArray.length; i++){
//
//                if (String.valueOf(chArray[i]).equalsIgnoreCase(String.valueOf((char)num)) ){
//                    count++;
//                }
//
//            }
//
//        }
        //System.out.println(count);
        int lettersCounter = 0;
        while (fileInputStream.available() > 0){
            int x = fileInputStream.read();
            if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122))
                lettersCounter++;

        }

        System.out.println(lettersCounter);
        fileInputStream.close();

    }
}
