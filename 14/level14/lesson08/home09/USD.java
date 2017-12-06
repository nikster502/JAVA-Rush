package com.javarush.test.level14.lesson08.home09;

/**
 * Created by nik on 11.01.2017.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }


    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
