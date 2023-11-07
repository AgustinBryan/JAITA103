public class ReverseString{
    public static void main(String[] args) {
        String p="pippo";
        StringBuilder sb=new StringBuilder(p); //inizializzazione dell'oggetto Strinbuilder
        sb.reverse();
        System.out.println(sb); //sb è un oggetto di tipo stringa
        //String reversed=sb.toString(); //per stampare invece bisogna scrivere così
        System.out.println(p);
        //System.out.println(reversed);
    }
}