import java.util.Scanner;

public class Nn{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter an amount as an integer (e.g., 1156 for 11 dollars and 56 cents): ");
        int totalAmount = input.nextInt();

       
        int dollars = totalAmount / 100;
        int cents = totalAmount % 100;

       
        System.out.println("Your amount $" + dollars + "." + cents + " consists of:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Cents: " + cents);

        
        
    }
}


