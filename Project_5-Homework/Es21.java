public class Es21 {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        int x = 12;
        int inizio = 0;
        int fine = arr.length - 1;
        int i;
        boolean medio = false; 

        while (!medio && inizio <= fine) {
            i = (inizio + fine) / 2;

            if(arr[i] == x) {
                System.out.println(x + " trovato in posizione " + i);
                medio = true;
            }else if (arr[i] < x) {
                inizio = i + 1;
            } else {
                fine = i -1;
            }
        }
        if (medio == false) {
            System.out.println("Numero non trovato nell'array");
        }
    }
}