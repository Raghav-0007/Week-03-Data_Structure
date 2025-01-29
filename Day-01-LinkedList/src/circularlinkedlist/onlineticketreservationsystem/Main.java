package circularlinkedlist.onlineticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding ticket reservations
        system.addTicket(101, "Alice", "Avatar", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Titanic", "B3", "12:00 PM");
        system.addTicket(103, "Charlie", "Avatar", "C2", "10:00 AM");
        system.addTicket(104, "David", "Inception", "D4", "2:00 PM");

        // Display current tickets
        system.displayTickets();

        // Search for a ticket by customer name
        system.searchTicket("Alice");

        // Search for a ticket by movie name
        system.searchTicket("Avatar");

        // Remove a ticket by Ticket ID
        system.removeTicket(102);

        // Display updated tickets
        system.displayTickets();

        // Get total number of booked tickets
        System.out.println("\nTotal Booked Tickets: " + system.getTotalTickets());
    }
}

