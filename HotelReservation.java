import java.util.*;

class Hotel {
    int rooms = 5;

    void bookRoom() {
        if(rooms > 0) {
            rooms--;
            System.out.println("Room booked successfully!");
        } else {
            System.out.println("No rooms available!");
        }
    }

    void cancelRoom() {
        rooms++;
        System.out.println("Booking cancelled!");
    }

    void checkRooms() {
        System.out.println("Available rooms: " + rooms);
    }
}

public class HotelReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel h = new Hotel();

        while(true) {
            System.out.println("1.Book 2.Cancel 3.Check 4.Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: h.bookRoom(); break;
                case 2: h.cancelRoom(); break;
                case 3: h.checkRooms(); break;
                case 4: System.exit(0);
            }
        }
    }
}