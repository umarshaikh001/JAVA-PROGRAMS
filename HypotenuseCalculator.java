import java.util.*;
public class HypotenuseCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fist side (x):");
        double x = sc.nextDouble();
        
        System.out.println("Enter the fist side (y):");
        double y = sc.nextDouble();

        double num = (x*x) +(y+y);

        System.out.println("Sum of sqrt of x&y is " + num );

        double Hypotenuse = Math.sqrt(num);
        System.out.println("the hypotenuse of the triengel is " + Hypotenuse);

    }
    
}
