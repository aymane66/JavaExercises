import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double InterestRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int periodYears = scanner.nextInt();

        double monthlyInterestRate = InterestRate / 1200;
        int numberOfPayments = periodYears * 12;

        double mortgage = principal
                        * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


        
    }
    
}