package rates;

import java.util.HashMap;
import java.util.Map;

public class Rates {
    private static final Map<String, Double> data = new HashMap<>();

    static {
        data.put("NGN_USD", 0.0012); // 1 Naira = 0.0012 USD
        data.put("USD_NGN", 830.0);  // 1 USD = 830 Naira
    }

    public static double get(String from, String to) {
        return data.getOrDefault(from + "_" + to, 1.0);
    }
}
