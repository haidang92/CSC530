package Recursion;

public class EndlessRecursion
{
    static int i = 1;
    public static void message()
    {
        System.out.println("This is a recursive method. " + i);
        i ++;
        message();
    }

    public static void main(String[] args)
    {
        message();
    }
}