//Class required for Scanner objects.
import java.util.*;

//Driver class
//Creates a purse object with a given amount and demonstrates that it works.

//Purse makeChange - creates a purse object that returns the amount given in minimum denomination
//public static void main - where the magic happens.

public class Register {
    Denomination fiftyBill = new Denomination("Fifty-Note", 50.00, "Bill", ""),     //Fifty Dollar Bill
                 twentyBill = new Denomination("Twenty-Note", 20.00, "Bill", ""),   //Twenty Dollar Bill
                 tenBill = new Denomination("Ten-Note", 10.00, "Bill", ""),         //Ten Dollar Bill
                 fiveBill = new Denomination("Five-Note", 5.00, "Bill", ""),        //Five Dollar Bill
                 oneBill = new Denomination("One-Note", 1.00, "Bill", ""),          //One Dollar Bill
                 quarter = new Denomination("Quarter", 0.25, "Coin", ""),           //Quarter
                 dime = new Denomination("Dime", 0.10, "Coin", ""),                 //Dime
                 nickel = new Denomination("Nickel", 0.05, "Coin", ""),             //Nickel
                 penny = new Denomination("Penny", 0.01, "Coin", "");               //Penny

    static Purse makeChange(double amt)
    {
        Purse purse = new Purse(); //make this a thing.

        //do things here

        return purse;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount of money: ");

        double amt;

        try{
            amt = scanner.nextDouble();
        }
        catch(Exception InputMismatchException){    //prevent exceptions from unexpected inputs, default to 0
            amt = 0.0;
        }

        Purse purse = makeChange(amt);
        System.out.println(purse.pursetoString());
    }

}
