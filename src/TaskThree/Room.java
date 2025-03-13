package TaskThree;

// 3.a
public class Room {

    // Attributes
    private int numberOfLamps;
    private int numberOfWindows;

    // Constructor
    // 3.b
    Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // added an overloaded constructor
    Room(){
        this.numberOfLamps = 0;
        this.numberOfWindows = 0;
    }

    // Methods
    // 3.c
    // Accessors
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    // Mutators
    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString(){
        String s = "No. of lamps: " + numberOfLamps + " | No. of windows: " + numberOfWindows + "\n";
        System.out.println(s);
        return s;
    }
}
