package com.javarush.test.level15.lesson12.home04;

import static com.javarush.test.level15.lesson12.home04.Solution.readKeyFromConsoleAndInitPlanet;

/**
 * Created by nik on 14.01.2017.
 */
public class Earth implements Planet
{
    private static Earth earth;

    private Earth(){}
    static{
        try{
            earth = new Earth();
        }catch(Exception e){
            throw new RuntimeException("При создании объекта «Singleton» произошла ошибка");
        }


    }
    public static Earth getInstance(){
        return earth;
    }

}
