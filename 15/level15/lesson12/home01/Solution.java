package com.javarush.test.level15.lesson12.home01;


        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
  try
            {
                if (s.contains(".")){
                    print(Double.parseDouble(s));
                }

            }
            catch (Exception e)
            {
                try
                {
                    if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                    {
                        print(Short.parseShort(s));
                    }
                }

                catch (Exception e1e){

                    try
                    {
                        if (Integer.parseInt(s)>=128&&Double.parseDouble(s)%1==0){
                            print(Integer.parseInt(s));
                        }
                    }
                    catch (Exception e1){
                        print(s);
                    }
                }

            }


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            if (s.equals("exit")){
                break;
            }
            list.add(s);
        }
        for (String s : list){
            try
            {
                if (s.contains(".")){
                    print(Double.parseDouble(s));
                }
                else  if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                {
                    print(Short.parseShort(s));
                }
                else  if (Integer.parseInt(s)>=128&&Double.parseDouble(s)%1==0){
                    print(Integer.parseInt(s));
                }
            }
            catch (Exception e){
                print(s);
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

