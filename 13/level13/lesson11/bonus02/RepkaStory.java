package com.javarush.test.level13.lesson11.bonus02;

import java.util.List;

public class RepkaStory
{
    static void tell(List<Person> items) {

        Person first;
        String second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1).getNamePadezh();
            first.pull(second);
        }
    }
}
