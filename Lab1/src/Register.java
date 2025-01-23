//Class required for Scanner objects.
import java.util.*;

//Driver class
//Creates a purse object with a given amount and demonstrates that it works.

//Purse makeChange - creates a purse object that returns the amount given in minimum denomination
//public static void main - where the magic happens.

public class Register {

    public static Purse makeChange(double amt)
    {
        List<Denomination> denominations = List.of(                                            //List of all denominations
                new Denomination("Hundred-Dollar", 100.00, "Bill", ""),          //Hundred Dollar Bill
                new Denomination("Fifty-Dollar", 50.00, "Bill", ""),             //Fifty Dollar Bill
                new Denomination("Twenty-Dollar", 20.00, "Bill", ""),            //Twenty Dollar Bill
                new Denomination("Ten-Dollar", 10.00, "Bill", ""),               //Ten Dollar Bill
                new Denomination("Five-Dollar", 5.00, "Bill", ""),               //Five Dollar Bill
                new Denomination("One-Dollar", 1.00, "Bill", ""),                //One Dollar Bill
                new Denomination("Quarter", 0.25, "Coin", ""),            //Quarter
                new Denomination("Dime", 0.10, "Coin", ""),               //Dime
                new Denomination("Nickel", 0.05, "Coin", ""),             //Nickel
                new Denomination("Penny", 0.01, "Coin", "")               //Penny
        );

        Purse purse = new Purse();

        for (Denomination list : denominations) {
            int count = (int)(amt / list.amt()); //type cast the result of dividing amt by the value of the current bill to integer, to know how many of that bill can be derived from amt.

            if(count > 0) //if a number of bills can be derived from amount, add to purse and decrement amt.
            {
                purse.add(list, count); // add the number of the current denomination to purse
                amt -= count*list.amt(); //subtract the number of bills * the value of that bill from amt, then continue iterating.
            }
        }

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
