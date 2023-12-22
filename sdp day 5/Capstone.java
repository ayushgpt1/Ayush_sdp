// Java tester class to test RoomDetails class
public class Tester {
    public static void main(String[] args) {
        // Create RoomDetails object with customer details
        RoomDetails room = new RoomDetails("John Doe", "Deluxe", 1, 5);

        // Calculate total bill
        double totalBill = room.calculateBill();

        // Display customer details and total bill
        System.out.println("BillId: " + room.getBillId());
        System.out.println("Customer Name: " + room.getCustomerName());
        System.out.println("No. of days of Stay: " + room.getNoOfDaysOfStay());
        System.out.println("Total Bill: " + totalBill);
    }
}
// RoomBillComponent interface with room bill components
public interface RoomBillComponent {
    double FOOD_CHARGE = 100.0;
    double EXTRA_PERSON_CHARGE = 200.0;
    double TAX = 0.12;

    double calculateBill();
}

// RoomDetails class implementing RoomBillComponent interface
public class RoomDetails implements RoomBillComponent {
    private static int counter = 101;

    private int billId;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPerson;
    private int noOfDaysOfStay;

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPerson, int noOfDaysOfStay) {
        this.billId = counter++;
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPerson = noOfExtraPerson;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }

    @Override
    public double calculateBill() {
        double baseRoomFare;

        // Validate type of room
        if (!validateTypeOfRoom()) {
            System.out.println("Invalid room type. Please select Standard, Deluxe, or Cottage.");
            return 0.0;
        }

        // Validate number of days of stay
        if (!validateNoOfDaysOfStay()) {
            System.out.println("Invalid number of days of stay. Minimum 1 day and maximum 15 days allowed.");
            return 0.0;
        }

        // Validate number of extra persons
        if (!validateNoOfExtraPerson()) {
            System.out.println("Maximum of 2 extra persons allowed per room.");
            return 0.0;
        }

        // Calculate base room fare based on type of room
        switch (typeOfRoom.toLowerCase()) {
            case "standard":
                baseRoomFare = 1000.0;
                break;
            case "deluxe":
                baseRoomFare = 1500.0;
                break;
            case "cottage":
                baseRoomFare = 2000.0;
                break;
            default:
                return 0.0;
        }

        // Calculate total bill
        double totalBill = (noOfDaysOfStay * baseRoomFare) + (noOfDaysOfStay * FOOD_CHARGE) +
                (EXTRA_PERSON_CHARGE * noOfExtraPerson);
        totalBill = totalBill + TAX * totalBill;

        return totalBill;
    }

    private boolean validateTypeOfRoom() {
        return typeOfRoom.equalsIgnoreCase("standard") ||
                typeOfRoom.equalsIgnoreCase("deluxe") ||
                typeOfRoom.equalsIgnoreCase("cottage");
    }

    private boolean validateNoOfDaysOfStay() {
        return noOfDaysOfStay >= 1 && noOfDaysOfStay <= 15;
    }

    private boolean validateNoOfExtraPerson() {
        return noOfExtraPerson >= 0 && noOfExtraPerson <= 2;
    }

    // Getters for room details
    public int getBillId() {
        return billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNoOfDaysOfStay() {
        return noOfDaysOfStay;
    }
}


