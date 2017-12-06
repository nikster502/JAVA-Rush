package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by nik on 11.01.2017.
 */
public  class Singleton
{
private static Singleton singleton;
    private Singleton(){

    }
    static {
        try
        {
            singleton = new Singleton();
        }
        catch (Exception e){

        }
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
