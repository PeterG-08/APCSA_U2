package L2;

public class GeoLocation
{
    public static void main(String[] args) {
        GeoLocation geo = new GeoLocation(14, 15);
        geo.printCoords();
    }

    private double latitude;
    private double longitude;

    public GeoLocation(double lat, double lon)
    {
        latitude = lat;
        longitude = lon;
    }

    public String getCoords()
    {
        String coords = "(" + latitude + ", " + longitude + ")";
        return coords;
    }

    public void printCoords()
    {
        System.out.println(getCoords());
    }
}

