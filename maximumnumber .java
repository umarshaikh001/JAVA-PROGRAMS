import java.util.*;
public class maximumnumber  {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number one ");
        int a = sc.nextInt();

        System.out.println("Enter a number two ");
        int b = sc.nextInt();

        System.out.println("Enter a number third ");
        int c = sc.nextInt();

        if(a >= b && a>=c){
            System.out.println(a + "a is largest number");
        }
        else if(b >= a && b>=c){
            System.out.println(b + "b is largest number");
        }
        
        else 
        System.out.println(c + "c is largest number");

        sc.close();
    }
    
}
