public class ForLoops {
    public static void main(String[] args){
        boolean pippo = true;
        for(int i=0; i<4; i++){
            System.out.println("siamo i campioni del mondo!");
            if(pippo && i==2){
                System.out.println ("qui finisce il ciclo for");
                break;
            }
        }
        // output finale: interrogare se un numero è pari o dispari
        
        for(int i=1; i<=10; i++){
            if(i%2==0) {
                System.out.println(i + " è pari ");
            } else{
                System.out.println(i + " è dispari ");
            }

        }
        
    }
}