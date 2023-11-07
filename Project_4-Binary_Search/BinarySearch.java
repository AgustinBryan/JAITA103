public class BinarySearch {
    // public static void main(string[] args) {
        //esempio di ricerca binaria
        // public int ricercaBinaria(int[] array, int valore) {
        //     while (inizio <= fine) {
        //         int mezzo = inizio + (fine - inizio) / 2;
        //         //Controlla se il valore è presente a metà
        //         if (array[mezzo] == valore)
        //         return mezzo;
                
        //         //Se il valore cercato è maggiore, ignora la metà sinistra
        //         if (array[mezzo] < valore);
        //             inizio = mezzo +1;

        //         //Altrimenti, ignora la metà destra
        //         else
        //             fine = mezzo -1;
                
        //     }
        //     // Se non troviamo il valore, ritorniamo -1
        //     return -1;
        // }
        
     //ricerca binaria - iterativa
    int binarySearch(int arr[], int x) {
    int lo = 0, hi = arr.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (arr[mid] == x)
        return mid;

      if (arr[mid] < x)
        lo = mid + 1;

      else
        hi = mid - 1;
    }
    return -1;
    }

    // public static void main(String args[]) {
      BinarySearch ob = new BinarySearch();
      int arr[] = {1, 2, 3, 4, 5};
      int n = arr.length;
      int x = 5;
      int position = ob.binarySearch(arr, x);
      if (position == -1)
        System.out.println("Element not present");
      else
        System.out.println("Element found at index: " + position);
    }

    //ricerca binaria - ricorsiva
    
    int binarySearch(int arr[], int lo, int hi, int x) {
        if (hi >= lo && lo < arr.length - 1) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == x)
        return mid;
        if (arr[mid] > x)
        return binarySearch(arr, lo, mid - 1, x);
        return binarySearch(arr, mid + 1, hi, x);
        }
        return -1;
        }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 2;
        int position = ob.binarySearch(arr, 0, n - 1, x);
        if (position == -1)
            System.out.println("Element not found !!!");
        else
            System.out.println("Element found at index: " + position);
    }

    java public class RicercaBinaria { 
      public static void main(String[] args) { 
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}; 
        int target = 28; 
        int indice = ricercaBinaria(array, target); 
        if (indice != -1) { 
          System.out.println("Elemento trovato all'indice " + indice); 
          } else { System.out.println("Elemento non trovato");
          }
        } 
      public static int ricercaBinaria
      (int[] array, int target) { 
        int sinistra = 0; 
        int destra = array.length - 1; 
        while (sinistra <= destra) { 
          int centro = (sinistra + destra) / 2; 
          if (array[centro] == target) { 
            return centro;
          } if (array[centro] < target) { 
            sinistra = centro + 1; 
          } else { destra = centro - 1; 
          }
        } 
        return -1; 
      } 
    }

}

