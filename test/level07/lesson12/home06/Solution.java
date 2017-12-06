package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
      Human ded1 = new Human("ded1",true,77,null,null);
      Human ded2 = new Human("ded2",true,75,null,null);
      Human bab1 = new Human("bab1",false,88,null,null);
      Human bab2 = new Human("bab2",false,73,null,null);
      Human father = new Human("father",true,33,ded1,bab1);
      Human mother = new Human("mother",false,27,ded2,bab2);
      Human chiald1 = new Human("chiald1",true,1,father,mother);
      Human chiald2 = new Human("chiald2",true,3,father,mother);
      Human chiald3 = new Human("chiald3",true,5,father,mother);
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(chiald1.toString());
        System.out.println(chiald2.toString());
        System.out.println(chiald3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human(String name, boolean sex,int age,Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
