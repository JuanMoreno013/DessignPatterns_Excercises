package prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static final Map<String,Color> colorMap = new HashMap<>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName)
    {
        return colorMap.get(colorName).clone();
    }
}
