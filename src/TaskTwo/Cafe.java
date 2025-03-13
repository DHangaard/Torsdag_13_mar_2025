package TaskTwo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    // Attributes
    // 2.c
    private ArrayList<String> coffeeMenu;

    // Constructor
    Cafe() {
    coffeeMenu = new ArrayList<>();
    }

    // Methods
    // 2.c
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // path = "data/coffees.txt"
    public void loadMenuData(String path) {

        // 2.d
        try {
            File file = new File(path);
            Scanner scan = new Scanner(file);

            // 2.e
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }

        } catch (IOException ioe) {
            System.err.println("[ERROR] unable to load file");
        }
    }
}


