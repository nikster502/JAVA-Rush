package com.javarush.test.level14.lesson06.home01;

/**
 * Created by nik on 10.01.2017.
 */
public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 2;
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}