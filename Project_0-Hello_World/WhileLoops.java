public class WhileLoops {
    public static void main (String[] args){
        // int i = 0;
        // while (i<5){
        //     System.out.println(i);
        //     i+=1;

        // }
        // double randNum = Math.random();
        // // Variabile: randNum = Math.random() 
        // while(randNum<0.5){ 
        //     //se il numero random è minore di 0.5, ripete il while
        //     //1.se il numero random è maggiore di 0.5
        //     randNum=Math.random();
        //     //Math.random() genera un numero randomico tra 0,1
        // }
        // System.out.println(randNum);
        // //2.il numero maggiore di 0.5 verrà stampato
        double randN;
        do{
            randN = Math.random();
            System.out.println(randN);
        }while(randN<0.5);


    }
}