import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int A=0, B=0;


        // TODO: greet the user
        System.out.println("Welcome! Let's compute the GCD.");

        // TODO: read first integer (repeat until positive)
        do {
            System.out.print("Please enter the first positive integer ");
            A = Integer.valueOf(reader.nextLine());
            System.out.print("Please enter the second positive integer ");
            B = Integer.valueOf(reader.nextLine());
        } while(A <= 0 || B <= 0);


       while(B > 0) {
           if (A > B)
               A = A - B;
           else 
               B = B - A;
       }
           System.out.println("Gcd is " + A);

               // TODO: read second integer (repeat until positive)
           }

           // TODO: compute GCD


           }

        // TODO: print out answer


