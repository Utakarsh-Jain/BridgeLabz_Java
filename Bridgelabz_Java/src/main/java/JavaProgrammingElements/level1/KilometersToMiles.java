class KilometersToMiles {
    public static void main(String[] args) {
        double distanceInKm = 10.8;
        double milesPerKm = 1.6;
        double distanceInMiles = distanceInKm * milesPerKm;
        System.out.println("The distance " + distanceInKm
                + " km in miles is " + distanceInMiles);
    }
}