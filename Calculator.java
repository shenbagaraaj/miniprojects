package javaproblems;

// It is a Simple Calculator.. Here we can do the following operations such as addition , subtraction, Multiplication and division 

import java.util.Scanner;

public class Calculator{
    public void addition(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elements need to add ");
        int n = scanner.nextInt();
        for (int i=0; i<n;i++){
            System.out.println("Enter the value");
            int q = scanner.nextInt();
            result= result+q;
        

        }
        System.out.println("The final answer is " + result);
        scanner.close();
    }
    public void subtraction(){
        System.out.println("Only you can subtract one number from another number like 2-1 ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println("The final answer is " +Math.abs(first-second));
        scanner.close();    
    }
    public void Multiplication(){
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.println("Enter the count of elements need to multiply");
        int n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            int value = scanner.nextInt();
            result = result * value;
        }System.out.println("The final answer is " + result);scanner.close();
    }
    public void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can divide only two numbers ");
        float first = scanner.nextInt();
        float second = scanner.nextInt();
        System.out.println("The final answer is " + (first/second));
        scanner.close();
        
    }
    public void modulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values ");
        float f = scanner.nextFloat();
        float s = scanner.nextFloat();
        System.out.println("The Final answer is " + (f % s));
        scanner.close();
    }
    public static void main (String[]args){
        System.out.println("Hi all, This is a simple calculator. Here you can execute the following operations.");
        System.out.println("The operations are addition, subtraction, multiplication, division and modulus");
        System.out.println("Choices : add, sub, mul, div, modulo");
        Calculator obj = new Calculator();
        Scanner scanner = new Scanner (System.in);
        String query = scanner.next();

        switch(query){
            case ("add"):
               obj.addition();
               break;
            case ("sub"):
               obj.subtraction();
               break;
            case ("mul"):
               obj.Multiplication();
               break;
            case ("div"):
               obj.division();
               break;
            case ("modulo"):
              obj.modulo();
              break;
               
      
        }

        scanner.close();
    }
}