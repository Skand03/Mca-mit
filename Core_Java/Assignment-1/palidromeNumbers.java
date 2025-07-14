import java.util.Scanner;

public class palidromeNumbers  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Palindrome value");
        int value = sc.nextInt();
        int originalValue = value;
        int reverseValue = 0;

        while(value!=0) {
            int digit = value%10;
            reverseValue = reverseValue*10+digit;
            value=value/10;
        }
       if(originalValue==reverseValue){
           System.out.println("This is palidrome");
       }else {
           System.out.println("This is not palidrome");
       }
    }
}
