// Java program explaining Currency class methods

// Kai:  Currency has no amount. So sitll use bigdata or double? 

// getInstance(), getCurrencyCode(),getDefaultFractionDigits()
// getDisplayName(), getSymbol()
import java.util.*;
import java.text.NumberFormat;
import java.text.ParseException;




public class CurrencyExample
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
    	
    	try {
			Number num = NumberFormat.getNumberInstance(Locale.FRANCE).parse("132 423 265,858");
			 System.out.println("parsed number:" + num);
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        // Use of getInstance() method to 'AUD' instance
        Currency c1 = Currency.getInstance("AUD"); //Australian Dollar
        Currency c2 = Currency.getInstance("JPY");  //Japan Yen
        Currency c3 = Currency.getInstance("USD");  //Japan Yen
 
        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        System.out.println("Australian Dollar code : " + cCode1);
        System.out.println("Japan Yen code : " + cCode2);
        System.out.println("");
 
        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("AUD Fraction digits : " + D1);
 
        int D2 = c2.getDefaultFractionDigits();
        System.out.println("JPY fraction digits : " + D2);
        System.out.println("");
 
        // Use of getDisplayName() method
        System.out.println("AUD Display : "+c1.getDisplayName());
        System.out.println("JPY Display : "+c2.getSymbol());
        System.out.println("");
 
        // Use of getSymbol() method
        System.out.println("JPY Symbol : "+c2.getSymbol());
        System.out.println("USD Symbol : "+c3.getSymbol());
 
    }
}
