class EarthVolume {
    public static void main(String[] args) {
        double radiusInKm = 6378;
        double pi = 3.14159265359;
        double kilometerToMile = 0.621371;
        double volumeInKm = (4.0 / 3.0) * pi * radiusInKm * radiusInKm * radiusInKm;
        double radiusInMiles = radiusInKm * kilometerToMile;
        double volumeInMiles = (4.0 / 3.0) * pi   * radiusInMiles * radiusInMiles * radiusInMiles;
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm);
        System.out.println("The volume of earth in cubic miles is"  + volumeInMiles);
    }
}