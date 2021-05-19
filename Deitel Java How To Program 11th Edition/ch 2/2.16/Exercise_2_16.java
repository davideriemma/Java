/*Esercizio 2.16 fatto a capa di cazzo*/

import java.util.Scanner;

public class Exercise_2_16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Immettere un numero intero: ");
        number = input.nextInt();

        if(number > 100)
        {
            if (number * number > 100)
                System.out.println("Il numero ed il suo quadrato sono maggiori di 100");
        }
        else
        {
            System.out.println("Il numero ed il suo quadrato non sono maggiori di 100");
        }
    }
}
