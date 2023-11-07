public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");

        String hello="Hello World";
        System.out.println("hello");
        String x1="pippo";
        int x=3160;
        double y=3.14;
        int z=9;
        double w=(double)9;
        z=(int)3.14;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(x+"\n"+y);
        //System.out.println(String.valouOf(x)+"\n"+String.valouOf(y));
        //x=true;
        final int b=3;
        //b=27;
        byte b1=8; //8 bit signed
        short s1=200; //16 bit signed
        int i1=1_000_000_000; //32 bit signed
        long l1=10_000_000_000L; //64 bit signed
        char c1='a'; //16 bit unsigned
        float f1=3.14F; //32 bit 
        double d1=3.14; //64 bit
        boolean b2=false;

        boolean isBalanceNegative=false;
        if(isBalanceNegative) {
            System.out.println("sei un barbone");
            System.out.println("sei un grosso barbone");
            
        }
        double height=172;
        boolean isVeryTall=height>=200;
        double weight=98.7;
        if(height>200) {
            System.out.println("sei altissimo");
            if (weight>110){
                System.out.println("potresti giocare a basket ma sei troppo grasso");
            } else {
                System.out.println("vai a giocare a basket");
            }
        } else if(height>180 && weight>90) {
            System.out.println("sei di altezza media ma anche cicciottello");
        } else if (height>=180 && weight<=90) {
            System.out.println("sei alto e magro");
        } else if (height>170) {
            System.out.println("sei comunque piu alto di me");
        } else {
            System.out.println("sei bassino");
        }
        boolean isSunny=false;
        double temperature=26.5;
        if (isSunny || temperature>25){
            System.out.println("andiamo al mare");
        } 
        int z1=0;
        int r3=10;
        if (z1 != 0 && r3/z1>3) {
            
        }
        
    
            

        







    }
}