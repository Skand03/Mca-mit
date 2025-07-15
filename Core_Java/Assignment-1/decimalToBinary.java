import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal Value");
        int decimalNumber = sc.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println(binaryNumber);
        System.out.println(decimalNumber);

    }
}
