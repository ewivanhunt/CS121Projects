package WeekFour;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of floors in the hotel: ");
        int numFloors = console.nextInt();

        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        for (int floor = 1; floor <= numFloors; floor++) {
            System.out.print("Enter the number of rooms on floor " + floor + ": ");
            int roomsOnFloor = console.nextInt();
            totalRooms += roomsOnFloor;

            System.out.print("Enter the number of occupied rooms on floor " + floor + ": ");
            int occupiedRoomsOnFloor = console.nextInt();
            totalOccupiedRooms += occupiedRoomsOnFloor;
        }

        double occupancyRate = (double) totalOccupiedRooms / totalRooms;

        System.out.println("\nHotel Occupancy Summary:");
        System.out.println("Number of floors: " + numFloors);
        System.out.println("Total number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupiedRooms);
        System.out.println("Total number of vacant rooms: " + (totalRooms - totalOccupiedRooms));
        System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate * 100);

        console.close();
    }
}


