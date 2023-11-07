public class EsercizioFunzioni {
    public static void main(String[] args) {
        int x1=3;
        int x2=4;
        int result=sum(x1,x2);
        System.out.println(result);
        // System.out.println(sum(x1,x2)); <-- oppure scritto in questo modo
        String s = "pippo";
        String s2 = null;
    
    } // <-- chiusura funzione.
        //sommare i due numeri nel metodo main
    public static int sum(int n1,int n2) {
        return n1+n2;
    }
       //invertire stringa
    
    public static String invertString(String s1){
        String s = "";
        for(int i=s1.length()-1; i>=0; i--){
            s+=s1.charAt(i);
        }
        return s;
    }



}
