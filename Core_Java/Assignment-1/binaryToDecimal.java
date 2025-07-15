import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        String binaryNumber = sc.nextLine();

      int decimalNumber = Integer.parseInt(binaryNumber,2);
        System.out.println(binaryNumber);
        System.out.println(decimalNumber);
    }
}
