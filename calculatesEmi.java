import java.util.Scanner;

class calculatesEmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate and time
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time period in years: ");
        double time = sc.nextDouble();

        // Convert annual rate to monthly rate
        double monthlyRate = rate / (12 * 100);
        double months = time * 12;

        // EMI formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("EMI is Rs " + emi);
        
        sc.close();
    }
}
