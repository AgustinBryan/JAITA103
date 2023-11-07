public class Arrays {
    public static void main (String[] args){
        int x = 5; //variabile
        int[] nums = new int[5];
          //int [] è un array di interi
          
          //System.out.println(nums[nums.length-1]);
        nums[0]=27;
        nums[nums.length-1]=30;
          //System.out.println(nums[nums.length-1]);
        for(int i = 0; i<nums.length; i++){
          System.out.print(i+"->"); //stampa la posizione seguita da una freccia
          System.out.println(nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
         nums[i]=i;
            
         System.out.println(nums[i]);
        }
        System.out.println("********");

        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = i*2;
            } else {
                nums[i] = 1*3;
            }
        }
          
        for(int i=0; i<nums.length; i++){
            if(i % 2 == 0){
                nums[i] = 2 * i;
            } else {
                nums[i] = 3 * i;
            }
            System.out.println(nums[i]);
        }


        //creare una variabile che abbia come valore il massimo come valore in quell'array
        System.out.println("********");
        
        int max = nums[0];
        for(int i=1; 1<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
        
        // Creare una variabile che abbia come valore il minimo valore dell'array, e stamparla.

        int min = nums[0];
        for ( int i = 1; i < nums.length; i++){
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);

        //creare una variabile che conterrà la somma di tutti gli elementi dell'array.
        
        double sum = 0;
        for (int i=0; i<nums.length; i++) {
            // sum = sum + nums[i];
            sum += nums[i];
        } 
        System.out.println(sum);
        System.out.println(sum/nums.length);

        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        System.out.println(nums[0] + " " + nums[1]);

        boolean found = false;
        int target = 4;
        for (int i=0; i < nums.length; i++){
            if(nums[i] == target){
                found = true;
                break;
            }
        }
        System.out.println(found);
        nums [0] = 9;
        int mode = -1;

        System.out.println(mode);      
    }
}