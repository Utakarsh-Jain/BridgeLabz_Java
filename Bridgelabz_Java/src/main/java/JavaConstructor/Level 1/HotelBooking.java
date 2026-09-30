/*
Problem 4 : Java Constructor Level 1
Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
Name: Utakarsh Jain
Date: 30/09/2026
*/

class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() { // Default Constructor
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) { // Parameterized Constructor
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking booking) { // Copy Constructor
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }
    void display() { // Method to display the booking details
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
    public static void main(String args[]) { // Main method
        HotelBooking booking1 = new HotelBooking(); // Creates a booking with default values
        HotelBooking booking2 = new HotelBooking("Utakarsh", "Deluxe", 5); // Creates a booking with parameterized values
        HotelBooking booking3 = new HotelBooking(booking2); // Creates a copy of booking2
        booking1.display();
        booking2.display();
        booking3.display();
    }
}
