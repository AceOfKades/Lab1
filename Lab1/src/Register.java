//Class required for Scanner objects.
import java.util.*;

//Driver class
//Creates a purse object with a given amount and demonstrates that it works.

//Purse makeChange - creates a purse object that returns the amount given in minimum denomination
//public static void main - where the magic happens.

public class Register {

    public static Purse makeChange(double amt)      //converts the given amt to into denominations that are stored in a returned purse object
    {
        List<Denomination> denominations = List.of(                                                   //List of all denominations
                new Denomination("One-Hundred-Dollar", 100.00, "Bill", ""),      //Hundred Dollar Bill
                new Denomination("Fifty-Dollar", 50.00, "Bill", ""),             //Fifty Dollar Bill
                new Denomination("Twenty-Dollar", 20.00, "Bill", ""),            //Twenty Dollar Bill
                new Denomination("Ten-Dollar", 10.00, "Bill", ""),               //Ten Dollar Bill
                new Denomination("Five-Dollar", 5.00, "Bill", ""),               //Five Dollar Bill
                new Denomination("One-Dollar", 1.00, "Bill", ""),                //One Dollar Bill
                new Denomination("Quarter", 0.25, "Coin", ""),                   //Quarter
                new Denomination("Dime", 0.10, "Coin", ""),                      //Dime
                new Denomination("Nickel", 0.05, "Coin", ""),                    //Nickel
                new Denomination("Penny", 0.01, "Coin", "")                      //Penny
        );

        Purse purse = new Purse(); // new purse to be filled and returned

        amt = Math.round((100.0*amt))/100.0; //Round amt to the nearest significant digit. Problem is, Math.round() rounds to the nearest *integer*. That requires
                                            //multiplying amt by 100 to retain significant digits, rounding, and then dividing it back down to its intended value.

        for (Denomination list : denominations) {   //iterate through list of denominations
            int count = (int)(amt/list.amt()); //type cast the result of dividing amt by the value of the current bill to integer, to know how many of that bill can be derived from amt.

            if(count > 0){ //if a number of bills can be derived from amount, add to purse and decrement amt.

                purse.add(list, count); // add the number of the current denomination to purse
                amt -= count*list.amt(); //subtract the number of bills * the value of that bill from amt, then continue iterating.
            }
        }

        return purse;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   //to detect inputs
        System.out.println("Enter an amount of money: ");

        double amt; //variable to store input in

        try{
            amt = scanner.nextDouble(); //if anything other than a number convertible to double is entered, catch
        }
        catch(Exception InputMismatchException){    //prevent exceptions from unexpected inputs, default to 0
            amt = 0.0;
        }

        Purse purse = makeChange(amt); //create purse object to store result of makeChange function

        System.out.println(purse.purseToString());  //print result to console
    }

}
