package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nik on 10.11.2016.
 */
public class variant7
{

 public static void main(String[] args) throws IOException
 {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Введите стоимость стерео системы- ");
     int s = Integer.parseInt(reader.readLine());
     System.out.print("процентная ставка-");
     int proc = Integer.parseInt(reader.readLine());
     System.out.print("ежемесячный взнос");
     int vznos = Integer.parseInt(reader.readLine());
     int dolg = s;


     System.out.println(dolg(dolg,vznos,proc));
 }
    static int  count = 0;
    static int result = 2;
   public static int dolg(int dolg, int vznos, int proc) {


        if (result>1){
            dolg = dolg - vznos+((dolg*proc)/100);
            count ++;
        result = dolg(dolg ,vznos ,proc);
        }
        return count ;
    }
}
