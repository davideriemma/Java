/*Exercise 2.17, con una modifica che include la classe Math ed il suo metodo Math.max()*/

import java.util.Scanner;

public class Exercise_2_17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first_number, second_number, third_number;

        System.out.print("Inserisci il primo intero: ");
        first_number = input.nextInt();
        System.out.print("Inserisci il secondo intero: ");
        second_number = input.nextInt();
        System.out.print("Inserisci il terzo intero: ");
        third_number = input.nextInt();

        System.out.printf("Numeri immessi: %d %d %d%n", first_number, second_number, third_number);
        System.out.printf("Somma: %d%n", first_number + second_number + third_number);
        System.out.printf("Media: %d%n", (first_number + second_number + third_number) / 3);
        System.out.printf("Prodotto: %d%n", first_number * second_number * third_number);
        //Versione Pro
        System.out.printf("Maggiore dei tre: %d%n", Math.max(Math.max(first_number, second_number), third_number));
        System.out.printf("Minore dei tre: %d%n", Math.min(Math.min(first_number, second_number), third_number));

        //versione noob
        if(first_number > second_number)
            if(first_number > third_number)
                System.out.printf("Il maggiore è %d%n", first_number);

        if(second_number > first_number)
            if(second_number > third_number)
                System.out.printf("Il maggiore è %d%n", second_number);

        if(third_number > first_number)
            if(third_number > second_number)
                System.out.printf("il maggiore è %d%n", third_number);
    }
}
