package map;

public class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void applyStyle(String locationName) {
        System.out.println("▶️ " + locationName + " [иконка: " + icon + ", цвет: " + color + ", стиль текста: " + labelStyle + "]");
    }
}
