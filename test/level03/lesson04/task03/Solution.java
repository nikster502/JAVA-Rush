package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        zerg.name = "ksdfjs";
        zerg1.name = "ksdffsjs";
        zerg2.name = "ksdfjsdf";
        zerg3.name = "fdksdfjs";
        zerg4.name = "kdsdfjs";
        zerg5.name = "kssadfjs";
        zerg6.name = "ksddfjs";
        zerg7.name = "ksdadsafjs";
        zerg8.name = "kbvsdfjs";
        zerg9.name = "ksdcccfjs";

        Protos protos0 = new Protos();
        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        protos0.name = "adfklsdkfslsdkf";
        protos1.name = "adfklsdkflssdkf";
        protos2.name = "adfklsdkfdflsdkf";
        protos3.name = "adfklsdkflsdkf";
        protos4.name = "adfklsdksdfdsflsdkf";
        Terran terran0 = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        terran0.name = "cfvghjkjhgffg5djas";
        terran1.name = "cfvghjkjhgff=gdjas";
        terran2.name = "cfvghjkjhgf-fgdjas";
        terran3.name = "cfvghjkjhg0ffgdjas";
        terran4.name = "cfvghjkjh9gffgdjas";
        terran5.name = "cfvghjkj8hgffgdjas";
        terran6.name = "cfvghjk7jhgffgdjas";
        terran7.name = "cfvghj6kjhgffgdjas";
        terran8.name = "cfvgh4jkjhgffgdjas";
        terran9.name = "cfvg3hjkjhgffgdjas";
        terran10.name = "cf2vghjkjhgffgdjas";
        terran11.name = "12cfvghjkjhgffgdjas";

        //напишите тут ваш код

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}