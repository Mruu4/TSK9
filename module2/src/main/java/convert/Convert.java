package convert;

import rates.Rates;

public class Convert {
    public static double now(String from, String to, double amount) {
        return amount * Rates.get(from, to);
    }


}
