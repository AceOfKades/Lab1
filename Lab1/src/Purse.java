
//Required class for Map and HashMap
import java.util.*;

//Class to translate value to minimum currency

//cash Map - to hold type of denomination and amount of that denomination
//void add - add denomination and amount to purse
//double remove - remove amount of denomination from purse
//double getValue() -
//String purseToString() - return a string version of the Purse object. Renamed to avoid hierarchy issues with Object class.

public class Purse {
    Map<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    void add (Denomination type, int num)
    {

    }

    double remove (Denomination type, int num)
    {
        return 1;
    }

    double getValue()
    {
        return 1;
    }

    String pursetoString()
    {
        return "";
    }
}
