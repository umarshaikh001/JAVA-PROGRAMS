
import java.util.*;
public class calculateEmi2 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in)
        Double principal,Rate,Time;

        Principal = Double.parseDouble(args[0]);
        System.out.println("Enter the Rate");

        Rate = sc.nextFloat();
        Time = 5;

        Rate = Rate/12*100;
        Time = Time * 100;

        double Emi = (Principal*Rate*Math.pow(1 + Rate, Time ))/ (Math.pow(1+Rate,Time)-1);
        System.out.println("Emi is in Rs ="+ Emi + "\n");
    }


    
}
