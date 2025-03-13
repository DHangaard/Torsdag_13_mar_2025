package TaskThree;

import java.util.ArrayList;

// 3.g
public class Main {

    public static void main(String[] args) {

        // 3.g
        Room room1 = new Room(1, 4);
        Room room2 = new Room(3, 3);
        Room room3 = new Room(2, 5);

        // 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i
        Building building1 = new Building(rooms, 2);

        // 3.k
        Building building2 = new Building(rooms, 4);

        // 3.j
        int lampsNum = countLampsInBuilding(building1);
        int windowsNum = countWindowsInBuilding(building1);
        int roomNum = countRoomsInBuilding(building1);

        System.out.println("Number of lamps in building: " + lampsNum + "\nNumber of windows in building: " + windowsNum + "\nNumber of rooms in building: " + roomNum);

        // 3.k
        System.out.print("Is the building normal? ");
        System.out.println(isNormal(building1));
        System.out.print("Is the building normal? ");
        System.err.print(isNormal(building2));
    }

    // 3.j
    static int countLampsInBuilding(Building building){
        int sumOfLampsInBuilding = 0;
        for (Room r : building.getRooms()){
            sumOfLampsInBuilding += r.getNumberOfLamps();
        }
        return sumOfLampsInBuilding;
    }

    static int countWindowsInBuilding(Building building){
        int sumOfWindowsInBuilding = 0;
        for (Room r : building.getRooms()){
            sumOfWindowsInBuilding += r.getNumberOfWindows();
        }
        return sumOfWindowsInBuilding;
    }

    static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }

    // 3.k
    static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}
