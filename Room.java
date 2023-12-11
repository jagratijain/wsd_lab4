
package HostelItems;
import Interfaces.Bookable;

public final class Room extends HostelItem implements Bookable {
    private int roomNumber;

    public Room(String name, double price, int roomNumber) {
        super(name, price);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayItem() {
        System.out.println("Room: " + name + " (Room Number: " + roomNumber + "), Price: Rs" + price);
    }

    @Override
    public void book() {
        System.out.println("--------------------------------");
        System.out.println("Booking room: " + roomNumber);
        System.out.println("--------------------------------");
    }
}
