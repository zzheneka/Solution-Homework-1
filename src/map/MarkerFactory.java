package map;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String type) {
        if (!styles.containsKey(type)) {
            switch (type) {
                case "hospital" -> styles.put(type, new MarkerStyle("🏥", "red", "bold"));
                case "restaurant" -> styles.put(type, new MarkerStyle("🍽️", "green", "italic"));
                case "gas" -> styles.put(type, new MarkerStyle("⛽", "blue", "regular"));
                default -> styles.put(type, new MarkerStyle("❓", "gray", "regular"));
            }
        }
        return styles.get(type);
    }

    public static int getUniqueStyleCount() {
        return styles.size();
    }
}
