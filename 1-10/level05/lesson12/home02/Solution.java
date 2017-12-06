package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import java.io.IOException;

public class Solution
{

    public static void main(String[] args) throws IOException
    {
Man man = new Man("Nik",22,"f");
Man man1 = new Man("Ni",2,"fff");
        Woman woman = new Woman("kol",2,"d");
        Woman woman1 = new Woman("kofdsl",23,"dsdf");
        System.out.println(man.toString());
        System.out.println(man1.toString());
        System.out.println(woman.toString());
        System.out.println(woman1.toString());
    }

    public static class Man{
    String name;
    int  age;
    String address;
        Man(String name , int age,String address){
            this.address = address;
            this.age = age;
            this.name = name;
        }
        public  String toString(){
            return this.name + " " + this.age + " " + this.address;
        }

}
    public static class Woman{

        String name;
        int  age;
        String address;
        Woman(String name , int age,String address){
            this.address = address;
            this.age = age;
            this.name = name;
        }
        public  String toString(){
            return this.name + " " + this.age + " " + this.address;
        }
}


        //создай по два объекта каждого класса тут

        //выведи их на экран тут
    }

    //добавьте тут ваши классы
