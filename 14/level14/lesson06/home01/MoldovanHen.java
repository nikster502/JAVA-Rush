package com.javarush.test.level14.lesson06.home01;

/**
 * Created by nik on 10.01.2017.
 */

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 3;
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
