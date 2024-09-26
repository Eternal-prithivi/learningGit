import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n, int p) throws Exception{
        if(n==0 && p==0){
            throw new Exception(n and p should not be zero.);
        }
        if(n < 0 || p<0 ){
            throw new Exception(n or p should not be negative.);
        }
        if(n ==0 ){
            return (long)0.0;
        }
        if(p==0){
            return (long)1.0;
        }
        long result=1;
        for(int i=1;i<=p;i++){
            result *= n;
        }
        return result;
    }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
