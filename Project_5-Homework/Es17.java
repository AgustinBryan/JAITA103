import java.util.Random;        
public class Es17 {
    public static void main(String[] args) {
        int[] arr = new int [6];
        Random rand = new Random();
        int i = 0;
        int temp = 0;

        while(i < arr.length) {
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
            i++;
        }

        for(i = 0; i <arr.length; i++) {
            for(int j = (i + 1); j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        for(i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}