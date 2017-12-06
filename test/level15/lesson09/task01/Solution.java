package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(22.2,"nikita5");
    labels.put(22.1,"nikita4");
    labels.put(22.4,"nikita3");
    labels.put(22.5,"nikita2");
    labels.put(22.3,"nikita1");
}
    public static void main(String[] args) {
        System.out.println(labels);

    }
}
