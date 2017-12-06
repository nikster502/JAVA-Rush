package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
 То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{String name ;
    int massa;
    int age;
    String color;
    String adress;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int massa, int age){
        this.name = name;
        this.massa = massa;
        this.age = age;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.massa = 22;
        this.age = age;
    }
    public void initialize(int massa,String  color){
       this.massa = massa;
        this.color = color;
        this.age = 3;
        this.name = "";
        this.adress = "";
    }
    public void initialize(int massa,String  color,String adress){
        this.massa = massa;
        this.color = color;
        this.adress = adress;
    }
}
