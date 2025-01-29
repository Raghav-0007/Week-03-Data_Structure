package circularlinkedlist.onlineticketreservationsystem;

class TicketReservationSystem {
    private Ticket last; // Points to the last node (since it's a circular list)
    private int count;   // Keeps track of the total tickets

    public TicketReservationSystem() {
        this.last = null;
        this.count = 0;
    }

    // Add a new ticket at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            // If list is empty, create a single-node circular list
            last = newTicket;
            last.next = last; // Circular link
        } else {
            newTicket.next = last.next; // New ticket points to the first node
            last.next = newTicket; // Last node points to new ticket
            last = newTicket; // Update last pointer
        }
        count++;
        System.out.println("Ticket Booked Successfully! Ticket ID: " + ticketID);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next, prev = last;
        boolean found = false;

        // Iterate through circular list
        do {
            if (current.ticketID == ticketID) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("Ticket ID not found.");
            return;
        }

        // Case 1: Only one ticket exists
        if (current == last && current.next == last) {
            last = null;
        }
        // Case 2: Removing first ticket
        else if (current == last.next) {
            last.next = current.next;
        }
        // Case 3: Removing last ticket
        else if (current == last) {
            prev.next = last.next;
            last = prev;
        }
        // Case 4: Removing a middle ticket
        else {
            prev.next = current.next;
        }

        count--;
        System.out.println("Ticket with ID " + ticketID + " removed successfully.");
    }

    // Display all ticket reservations
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = last.next;
        System.out.println("\nCurrent Ticket Reservations:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket temp = last.next;
        boolean found = false;
        System.out.println("\nSearch Results for: " + keyword);
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (!found) {
            System.out.println("No matching tickets found.");
        }
    }

    // Get the total number of booked tickets
    public int getTotalTickets() {
        return count;
    }
}
