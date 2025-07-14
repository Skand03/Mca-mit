public class positiveNumberArray {
    public static void main(String[] args) {
        int[] arr = {-1,2,-6,8,9,-7,9,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
            sum += arr[i];
            }
        }
            System.out.println("Sum of all positive number are " + sum);
    }
}
