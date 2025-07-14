//1. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class operators {

    public int sum(int a , int b){
        return a+b;
    }

    public int multiply(int a , int b){
        return a*b;
    }

    public int subtract(int a , int b){
        return a-b;
    }

    public int reminder(int a , int b){
        return a%b;
    }

    public int division(int a , int b){
        if(b!=0) {
            return a / b;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        System.out.println("Enter the Number");
        int b = sc.nextInt();

        operators op = new operators();
        System.out.println("The sum of two number is " +  op.sum(a,b));
        System.out.println("The multiply of two number is " + op.multiply(a,b));
        System.out.println("The subtract of two number is " + op.subtract(a,b));
        System.out.println("The division of two number is " + op.division(a,b));
        System.out.println("The reminder of two number is " + op.reminder(a,b));



    }
}
