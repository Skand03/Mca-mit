import java.util.Scanner;

public class averageNumber {
    public static int averageOfFiveNumbers(int a , int b , int c , int d , int e ){
        return (a+b+c+d+e)/5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("The average of five numbers are " + averageOfFiveNumbers(a,b,c,d,e));
    }
}
