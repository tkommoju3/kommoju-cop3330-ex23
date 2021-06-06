/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class CarTrouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String response;

        System.out.print("Is the car silent when you turn the key? ");
        response = input.nextLine();
        if (response.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            response = input.nextLine();
            if (response.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("The battery cables may be damaged. \nReplace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            response = input.nextLine();
            if (response.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                response = input.nextLine();
                if(response.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    response = input.nextLine();
                    if(response.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        response = input.nextLine();
                        if(response.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

}
