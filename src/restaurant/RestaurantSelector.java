package restaurant;

import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Is anyone in your party vegetarian?");
        String answer1 = console.next();
        System.out.print("Is anyone in your party vegan?");
        String answer2 = console.next();
        System.out.print("Is anyone in your party gluten-free?");
        String answer3 = console.next();


        if (answer1.equals("yes") && answer2.equals("yes") && answer3.equals("yes")){
            System.out.print("The Chef’s Kitchen, Corner Café");
        }else if (answer1.equals("yes") && answer2.equals("yes") && answer3.equals("no")){
            System.out.print("The Chef's Kitchen, Corner Café");
        }else if (answer1.equals("yes") && answer2.equals("no") && answer3.equals("no")){
            System.out.print("Mama’s Fine Italian, The Chef’s Kitchen, Corner Café, Main Street Pizza Company");
        }else if (answer1.equals("no") && answer2.equals("yes") && answer3.equals("yes")){
            System.out.print("Corner Café, The Chef’s Kitchen");
        }else if (answer1.equals("yes") && answer2.equals("no") && answer3.equals("yes")){
            System.out.print("The Chef’s Kitchen, Corner Café, Main Street Pizza Company");
        }else if (answer1.equals("no") && answer2.equals("no") && answer3.equals("no")){
            System.out.print("Joe’s Gourmet Burgers");
        }


    }
}
