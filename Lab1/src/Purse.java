
//Required class for Map and HashMap
import java.util.*;

//Class to translate value to minimum currency

//cash Map - to hold type of denomination and amount of that denomination
//void add - add denomination and amount to purse
//double remove - remove amount of denomination from purse and return new value
//double getValue() -
//String purseToString() - return a string version of the Purse object. Renamed to avoid hierarchy issues with Object class.

public class Purse {
    Map<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    void add (Denomination type, int num)
    {
        if(num<0) {num = 0;}    //catch any negative values
        if(cash.containsKey(type)) {cash.put(type, (cash.get(type)+num));} //if denomination is already in purse, add number of additional bills to existing number
        else{cash.put(type, num);}  //if denomination not in purse, add denomination and number of bills.
    }

    double remove (Denomination type, int num) {

        if (cash.containsKey(type)) {
            if (cash.get(type) < num) {
                num = cash.get(type); }   //if number of bills to be removed is greater than the amount available, set number to amount of bills available.

            cash.put(type, (cash.get(type) - num)); }

        return getValue();
    }

    double getValue()
    {
        double value = 0;

        for(Map.Entry<Denomination, Integer> bill: cash.entrySet())     //increments through this purse's cash Map one at a time
        {
            value += (bill.getKey().amt())*(bill.getValue());   //takes this entry's cash value and multiplies it by the amount of that bill, then adds it to value
        }

        return value;
    }

    String pursetoString()
    {
        return("Purse contents:" + cash.entrySet());    //temp fix, make this more aesthetically pleasing
    }
}
