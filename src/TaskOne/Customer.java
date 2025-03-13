package TaskOne;


// 1.a
public class Customer {

    // Attributes
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;


    // 1.b
    // Constructor
    Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        // 1.c
        this.id = counter;
        counter++;
    }

    // 1.d
    // Methods
    @Override
    public String toString() {

        String s = "Name: " + this.firstName + " " + this.lastName + "\nUsername: " + this.userName + "\nID: " + this.id + "\n";
        return s;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }


    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
}
