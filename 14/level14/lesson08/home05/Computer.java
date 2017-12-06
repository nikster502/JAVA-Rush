package com.javarush.test.level14.lesson08.home05;

/**
 * Created by nik on 11.01.2017.
 */
public class Computer
{
    public Computer()
    {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Keyboard getKeyboard(){
        return this.keyboard;
    }
    public Mouse getMouse(){
        return this.mouse;
    }
    public Monitor getMonitor(){
        return this.monitor;
    }
}
