package TaskTwo;

import java.util.ArrayList;

// 2.b
public class Main {

    static ArrayList<String> coffeeMenu;

    public static void main(String[] args) {

        // 2.g
        Cafe cafe = new Cafe();

        // path = "data/coffees.txt"
        cafe.loadMenuData("data/coffees.txt");

        // 2.h
        coffeeMenu = cafe.getCoffeeMenu();
        for (String s : coffeeMenu){
            System.out.println(s);
        }
    }

}
