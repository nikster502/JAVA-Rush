package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так,
 чтобы они соответствовали конструкторам класса Solution.
*/
public class Solution {
    private Solution(int i){}
    private Solution(String name,int n){}
    private Solution(int name ,String name2){}
    protected Solution(int i, int g){}
    protected Solution(String name,int n, int f){}
    protected Solution(int name ,String name2,int d){}
    public Solution(){}
    public Solution(String name){}
    public Solution(String name ,String name2){}


    Solution(Integer i, int g){}
    Solution(String name,Integer n, int f){}
    Solution(int name ,String name2,Integer d){}
}

