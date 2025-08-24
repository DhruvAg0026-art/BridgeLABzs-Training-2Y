public class VolumeOfEarthInKmAndMiles {
    public static void main(String[] args) {
        // Given: radius of Earth = 6378 km
        // Volume of a sphere = (4/3) * π * r^3
        double radiusKm = 6378.0;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // 1 mile = 1.6 km  => radius in miles = km / 1.6
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMiles3
        );
    }
}
