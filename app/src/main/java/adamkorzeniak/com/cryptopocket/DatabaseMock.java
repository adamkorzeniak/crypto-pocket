package adamkorzeniak.com.cryptopocket;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DatabaseMock {

    public final static String[] coinNames = {"Bitcoin", "Litecoin", "Ripple", "Ethereum"};
    public final static String[] coinSymbols = {"BTC", "LTC", "XRP", "ETH"};
    public final static Double[] prices = {7000.0, 140.0, 0.7, 350.0};
    public final static Double[] balances = {0.5, 3.0, 200.0, 5.0};
    public final static Event[] events = {
         new Event("SunContract", "SNC", "Platform Release", new Date(2018, 3, 13), "Platform realeased for energy trading in Slovenia"),
         new Event("Bitcoin", "BTC", "To The Moon", new Date(2018, 11, 31), "Bitcoin Price hits moon")
    };
}
