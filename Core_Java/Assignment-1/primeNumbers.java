public class primeNumbers {

    public boolean primeNumber(int i){
        if(i<=1){
            return false;
        }
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumbers pn = new primeNumbers();
        for(int i = 0; i<=100; i++){
            if(pn.primeNumber(i)){
                System.out.println(i + " ");
            }
        }
    }
}
