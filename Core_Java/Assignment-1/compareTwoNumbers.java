import java.util.Scanner;

public class compareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        System.out.println("Enter the numbers");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is the greater Number");
        }else{
            System.out.println("B is the greater Number");
        }
    }
}
