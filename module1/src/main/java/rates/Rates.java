package rates;

import java.util.HashMap;
import java.util.Map;

public class Rates {
    private static final Map<String, Double> data = new HashMap<>();

    static {

    }

    public static double get(String from, String to) {
        return data.getOrDefault(from + "_" + to, 1.0);
    }
}
