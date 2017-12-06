package com.javarush.test.level18.lesson10.home08;



import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        ReadThread readThread;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b;
        while (!(b = reader.readLine()).equals("exit")){
            readThread = new ReadThread(b);
            readThread.start();
            readThread.join();

        }
for (String vv: resultMap.keySet()){
    System.out.println(vv + "  "+ resultMap.get(vv));
}
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws FileNotFoundException
        {
            super(fileName);
            this.fileName = fileName;

            //implement constructor body
        }
        public void run(){

            try
            {
                FileInputStream file = new FileInputStream(getName());
                int[] bytes = new int[256];
                while (file.available() > 0)
                {
                    bytes[file.read()]++; // читаем файл и увеличиваем счетчик каждого байта
                }
                file.close();

                Integer maxCountedByte = 0;
                for (int i = 0; i < bytes.length; i++)
                {
                    if (bytes[i] > bytes[maxCountedByte])
                    {
                        maxCountedByte = i;  // находим индекс самого частого байта
                    }
                }

                synchronized (resultMap)
                {
                    resultMap.put(getName(), maxCountedByte); // записываем результат
                }

            }

            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
/*

package com.javarush.test.level18.lesson10.home08;




import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources


public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        ReadThread readThread;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b;
        while (!(b = reader.readLine()).equals("exit")){
            readThread = new ReadThread(b);
            readThread.start();
            readThread.join();

        }
        for (String vv: resultMap.keySet()){
            System.out.println(vv + "  "+ resultMap.get(vv));
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws FileNotFoundException
        {
            this.fileName = fileName;

            //implement constructor body
        }
        public void run(){

            try
            {

                FileInputStream fileInputStream = new FileInputStream(fileName);
                Map<Character,Integer> map = new HashMap<>();
                ArrayList<Character> list = new ArrayList<>();

                // тут заполняется лист и мап символами
                while (fileInputStream.available()>0){
                    int i = fileInputStream.read();
                    list.add((char)i);
                    map.put((char)i,0);
                }
                // подсчитывается колличество элемментов
                for (Character s : map.keySet()){
                    int v =0;
                    for (Character i : list){
                        if(i == s){
                            map.put(s ,++v);
                        }
                    }
                }
                //находится самое большое
                int vd =0;
                Character character = 0;
                for (Character m : map.keySet())
                {
                    if (vd < map.get(m))
                    {
                        vd = map.get(m);
                        character = m;
                    }
                }
                resultMap.put(fileName, (int)character);
                fileInputStream.close();
            }



            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
*/