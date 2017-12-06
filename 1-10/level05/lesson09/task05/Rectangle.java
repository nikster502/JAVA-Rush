package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
   int left, top, width, height;
    Rectangle(int left,int top,int width,int height){
        this.left =left;
        this.top = top;
        this.width =width;
        this.height = height;
    }
    Rectangle(int left,int top){
        this.left =left;
        this.top = top;
        this.width =0;
        this.height = 0;
    }
    Rectangle(int width){

        this.width =width;
        this.height = width;
    }
    Rectangle(){
        this.left =5;
        this.top = 45;
        this.width =4;
        this.height = 1;
    }
}
