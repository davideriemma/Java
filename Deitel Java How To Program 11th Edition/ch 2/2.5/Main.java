//program Main.java
//a)
//the program will calculate the product of three integers

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        //b)
        Scanner input = new Scanner(System.in);
        //c)
        System.out.print("Enter the first Integer: ");
        //d)
        int x = input.nextInt();
        //e)
        System.out.print("Enter the second Integer: ");
        //f)
        int y = input.nextInt();
        //g)
        System.out.print("Enter the third Integer: ");
        //h)
        int z = input.nextInt();
        //i)
        int result = x * y * z;
        //j)
        System.out.printf("Product is %d%n", result);
    }
}