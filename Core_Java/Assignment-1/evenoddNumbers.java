import java.util.Scanner;

class allNumbers{
        public void even(int i){
                if (i % 2 == 0) {
                    System.out.println("Even " + i);
            }
        }

        public void odd(int j){
                if (j % 2 != 0) {
                    System.out.println("odd " + j);
                }
        }
}

public class evenoddNumbers {
    public static void main(String[] args) {

    allNumbers n = new allNumbers();

    for(int i = 0; i<=20;i++){
       n.even(i);
       n.odd(i);
    }
    }
}
