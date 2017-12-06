package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name , color;
    int heidht;
    Dog(String name){
        this.name = name;
    }
    Dog(String name,int heidht){
        this.name = name;
        this.heidht = heidht;
    }
    Dog(String name,int heidht,String color){
        this.name = name;
        this.heidht = heidht;
        this.color = color;
    }
    //напишите тут ваш код

}
