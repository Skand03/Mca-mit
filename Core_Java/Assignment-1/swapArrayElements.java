public class swapArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
            }
        }
}
