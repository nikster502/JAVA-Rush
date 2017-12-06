package com.javarush.test.level15.lesson12.home04;

/**
 * Created by nik on 14.01.2017.
 */
public class Sun implements Planet
{
    private static Sun sun ;
    private Sun(){}
    static {try
    {
        sun = new Sun();
    }
       catch (Exception e){
           throw new RuntimeException("При создании объекта «Singleton» произошла ошибка");
       }
    }
    public static Sun getInstance(){
        return sun;
    }

}
