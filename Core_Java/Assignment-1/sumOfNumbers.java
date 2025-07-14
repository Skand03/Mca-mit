import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
//        int []number = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;

        System.out.println("Enter the Numbers");
        for(int i=0;i<number.length;i++){
            number[i] = sc.nextInt();
            sum = sum+number[i];
        }
        System.out.println(sum);
    }
}
