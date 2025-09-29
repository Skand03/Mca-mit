public class CommandLine {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int b = Integer.parseInt(args[2]);

        switch(op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println("Result: " + (a / b)); break;
            default:  System.out.println("Invalid operator!");
        }
    }
}