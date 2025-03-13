package TaskThree;

import java.util.ArrayList;

// 3.d
public class Building {

    // Attributes
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    // Constructor
    // 3.e
    Building(ArrayList<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // Methods
    // 3.f
    // Accessors
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Mutators
    // *** Should this add a room instead
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
