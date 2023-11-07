import java.util.Random;
public class Es20{
    public static void main(String[] args){
        int[] arr = new int[10];
        Random rand = new Random();
        int sum = 0;
        int i;

        for(i= 0; i< arr.length; i++){
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
        }

        i=0;
        System.out.println("somma");
        do{
            sum += arr[i];
            i++;
        }while(i != arr.length);
        System.out.println(sum);
    }
}