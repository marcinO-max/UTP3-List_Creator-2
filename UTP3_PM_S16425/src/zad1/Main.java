/**
 *
 *  @author Piątkowski Marcin S16425
 *
 */

package zad1;


import java.util.*;

public class Main {

  static List<String> getPricesInPLN(List<String> destinations, double xrate) {
    return ListCreator.collectFrom(destinations)
                       .when( zaczynajace -> zaczynajace.startsWith("WAW")
                    		   )
                       .mapEvery( czesc -> {
                    	   String[] slowo = czesc.split(" ");
                    	   String cel = slowo[1];
                    	   String cenaEuro = slowo[2];
                    	   double cenaEuroPln = (double)(Double.parseDouble(cenaEuro)) *xrate;
                    	   return String.valueOf( "to " + cel + " - price in PLN: " +cenaEuroPln);
                       }
                    		   
                        );
  }

  public static void main(String[] args) {
    // Lista destynacji: port_wylotu port_przylotu cena_EUR 
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = getPricesInPLN(dest, ratePLNvsEUR);
    for (String r : result) System.out.println(r);
  }
}
