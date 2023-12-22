import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FlightBookingSystem {

    public static void main(String[] args) {
        // Given flight time in IST
        LocalDateTime departureTime = LocalDateTime.of(2016, 11, 30, 21, 30, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2016, 12, 1, 6, 0, 0);

        // Customer's selected zone (example: UTC, America/New_York, etc.)
        String selectedZone = "UTC"; // Replace this with the actual zone chosen by the customer

        // Convert IST time to customer's selected zone
        ZonedDateTime departureZonedTime = convertToZone(departureTime, selectedZone);
        ZonedDateTime arrivalZonedTime = convertToZone(arrivalTime, selectedZone);

        // Displaying departure and arrival times in the selected zone
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");

        System.out.println("Departure Time: " + departureZonedTime.format(formatter));
        System.out.println("Arrival Time: " + arrivalZonedTime.format(formatter));
    }

    public static ZonedDateTime convertToZone(LocalDateTime dateTime, String zoneId) {
        ZoneId selectedZone = ZoneId.of(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Kolkata")); // IST Zone
        return zonedDateTime.withZoneSameInstant(selectedZone);
    }
}
