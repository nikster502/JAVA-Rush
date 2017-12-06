package com.javarush.test.level15.lesson12.home04;

/**
 * Created by nik on 14.01.2017.
 */
public class Moon implements Planet
{
    private static Moon moon;
    private Moon(){}
    static {
        try
        {
            moon = new Moon();
        }
        catch (Exception e){
            throw new RuntimeException("При создании объекта «Singleton» произошла ошибка");
        }
    }
    public static Moon getInstance(){
        return moon;
    }
}
