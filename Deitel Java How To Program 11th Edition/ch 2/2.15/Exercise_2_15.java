/*Esercizio 2.15*/

import java.util.Scanner;

public class Exercise_2_15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo intero: ");
        int first_number = input.nextInt();
        System.out.print("Inserisci il secondo intero: ");
        int second_number = input.nextInt();
        System.out.printf("Quadrato del primo: %d%n", first_number * first_number);
        System.out.printf("Quadrato del secondo: %d%n", second_number * second_number);
        System.out.printf("Somma dei quadrati: %d%n", first_number * first_number + second_number * second_number);
        System.out.printf("Differenza dei quadrati: %d%n", first_number * first_number - second_number * second_number);

        return;
    }
}
