package map;

public class MapMarker {
    private final double latitude;
    private final double longitude;
    private final String name;
    private final MarkerStyle style;

    public MapMarker(double latitude, double longitude, String name, String type) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.style = MarkerFactory.getStyle(type);
    }


    public void render() {
    }
}

