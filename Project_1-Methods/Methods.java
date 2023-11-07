public class Methods {
    public static int numero = 0;

    public static void main(String[] args){ //metodo main principale
       System.out.println (4*3);
       int numero = multiply();
       System.out.println(numero);
       quadrato();
       //200 righe dopo
       chiediCpsaVuoiFareOggi();
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
       LocalDate giorno = LocalDate.now();
       System.out.println(giorno);
       System.out.println("Cosa desideri oggi?");

       LocalDate giorno = LocalDate.now();
       System.out.println(giorno200);
       System.out.println("Cosa desideri oggi?");
    }
    public static ("chiediCosaVuoiFareOggi"){

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