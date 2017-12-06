package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.
 Придумай и реализуй 10 различных конструкторов для него.
  Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        int children;
        String addres;
        String shool;
        String city;
        Human(String name,int age,int children,String addres,String shool, String city){
            this.name = name;
            this.age = age;
            this.children = children;
            this.addres = addres;
            this.shool = shool;
            this.city = city;
        }
        Human(String name,int age,String addres,String shool, String city){
            this.name = name;
            this.age = age;
            this.addres = addres;
            this.shool = shool;
            this.city = city;
        }
        Human(String name,int age,int children,String addres, String city){
            this.name = name;
            this.age = age;
            this.children = children;
            this.addres = addres;
            this.city = city;
        }
        Human(String name,int age,String addres, String city){
            this.name = name;
            this.age = age;
            this.addres = addres;
            this.city = city;
        }
        Human(String name,int age, String city){
            this.name = name;
            this.age = age;
            this.city = city;
        }
        Human(int age,String city){
            this.age = age;
            this.city = city;
        }
        Human(String name,int age){
            this.name = name;
            this.age = age;
        }
        Human(int age,String addres,String shool, String city){
            this.age = age;
            this.addres = addres;
            this.shool = shool;
            this.city = city;
        }

        Human(int age,String addres, String city){
            this.age = age;
            this.addres = addres;
            this.city = city;
        }
        Human(String name){
            this.name = name;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
