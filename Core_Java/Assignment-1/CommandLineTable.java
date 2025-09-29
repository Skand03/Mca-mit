public class CommandLineTable {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        }else if (b<=c && b <= c) {
            smallest = b;
        }else{
            smallest = c;
        }

        System.out.println("Smallest: " + smallest);
        
//        for(int i = 1 ;i<=10;i++){
//            System.out.println(a + " * " + i + " = " + a*i);
//        }
    }
}
