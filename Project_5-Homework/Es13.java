import java.util.Random;
public class Es13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int sum = x + y;
        int times = x * y;
        double div = x / y;
        int sub = x - y;
        int res = % y;

        if(x > y) {
            sub  = x - y;
            div  = x / y;
            res  = x % y;
        } else {
            sub  = y - x;
            div  = y / x;
            res  = y % x;
        }       
    }
}