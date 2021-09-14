package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

//Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Asks user for two numbers and outputs the addition, subtraction, multiplication, and division of them
        System.out.print("What is the first number? ");
        int num1 = input.nextInt();

        System.out.print("What is the second number? ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}

