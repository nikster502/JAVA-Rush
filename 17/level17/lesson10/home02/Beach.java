package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public  synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized   int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {
        Beach q = (Beach) o;
        int d,qq;
        if (getDistance()>q.getDistance())
       d = 1;
    else if (getDistance()<q.getDistance())
       d =-1;
            else
               d= 0;
    if (getQuality()>q.getQuality())
        qq= 1;
            else if (getQuality()<q.getQuality())
                qq= -1;
            else
                qq= 0;

           return (10000*getName().compareTo(q.getName())+100*d+qq);




    }
}
