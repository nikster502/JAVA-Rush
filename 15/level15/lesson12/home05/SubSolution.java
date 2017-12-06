package com.javarush.test.level15.lesson12.home05;

/**
 * Created by nik on 15.01.2017.
 */
public class SubSolution extends Solution
{
   private SubSolution(int i)
    {

    }

    private SubSolution(String name, int n)
    {

    }

    private SubSolution(int name, String name2)
    {

    }

   protected SubSolution(int i, int g)
    {
        super(i, g);
    }

    protected SubSolution(String name, int n, int f)
    {
        super(name, n, f);
    }

    protected SubSolution(int name, String name2, int d)
    {
        super(name, name2, d);
    }

    public SubSolution()
    {
    }

    public SubSolution(String name)
    {
        super(name);
    }

    public SubSolution(String name, String name2)
    {
        super(name, name2);
    }

   SubSolution(Integer i, int g)
    {
        super(i, g);
    }

    SubSolution(String name, Integer n, int f)
    {
        super(name, n, f);
    }

     SubSolution(int name, String name2, Integer d)
    {
        super(name, name2, d);
    }
}
