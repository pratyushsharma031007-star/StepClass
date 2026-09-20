class HallTicket {
    String studentName;
    int seatNumber;

    // Constructor
    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create one object
        HallTicket priya = new HallTicket("Priya", 0);

        // Second variable points to the same object
        HallTicket copy = priya;

        // Change seat number using second variable
        copy.seatNumber = 45;

        // Print through first variable
        System.out.println(priya.studentName + "'s seatNumber (via first variable): "
            + priya.seatNumber);

        // Check if both variables refer to same object
        System.out.println("copy == priya: " + (copy == priya));

        // Create a separate object
        HallTicket separate = new HallTicket("Priya", 45);

        // Check if separate object is same as first object
        System.out.println("separate == priya: " + (separate == priya));
    }
}
