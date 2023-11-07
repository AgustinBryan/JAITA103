import java.time.DayOfWeek;
import java.time.LocalDate;
public class Methods {
    public static int numero = 0;

    public static void main(String[] args){ //metodo main principale
       System.out.println (4*3);
       int numero = multiply();
       System.out.println(numero);
       quadrato();
       //200 righe dopo
       chiediCosaVuoiFareOggi();
       LocalDate oggi = LocalDate.now();
       DayOfWeek giorno = oggi.getDayOfWeek();
    }
    public static giornoSettimana(){
        //  LocalDate oggi = LocalDate.now();
        //  DayOfWeek giorno = oggi.getDayOfWeek();
        DayOfWeek giorno = giornoSettimana();
        System.out.println(giorno);
         return giorno;
    }
    public static void printNumberAndReturn(int n, int b){
        System.out.println("Il primo valore passato è: "+n);
        System.out.println("Il secondo valore passato è: "+b);
        System.out.println("la somma de");
    }
    public static DayOfWeek giornoSettimana(){
        LocalDate oggi = LocalDate.now();
        DayOfWeek giorno = oggi.getDayOfWeek();
        return giorno;
    }   
       
    
    public static void chiediCosaVuoiFareOggi(){
        LocalDate giorno = LocalDate.now();
        System.out.println(giorno);
        System.out.println("cosa ti piacerebbe oggi?");
    }

    
    public static int multiply(){
        return 4*3;
    }

    public static void quadrato(){
        int numero1 = multiply();
        int numero2 = multiply();
        System.out.println(numero1 * numero2);
    }
}