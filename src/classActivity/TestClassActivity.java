package classActivity;

public class TestClassActivity {
    public static void main(String[] args) {

        Ethan name1 = new Ethan("Ethan", 22, "Oldest of 4");
        Drive car1 = new Drive("Toyota", "Camry", 2001);

        // Call methods from each class
        System.out.println("Information:");
        name1.EthanInfo();

        System.out.println("\nCar Information:");
        car1.displayDriveInfo();
    }
}