import java.util.Random;        
public class Es18 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random rand = new Random();
        int max;
        int min;
        int sum;
        int i;
        double avg;

        for(i = 0; i < arr.lenght; i++){
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println();

        max = arr[0];
        min = arr[0];
        sum = arr[0];
        for(i = 1; i < arr.length; i++){
            sum += arr[i];
        
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        avg = (double) sum /6;   
    }
}