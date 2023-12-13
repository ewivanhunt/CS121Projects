package classActivity;

 class Drive {
     String make;
     String model;
     int year;
     public Drive(String make, String model, int year) {
         this.make = make;
         this.model = model;
         this.year = year;
     }
     public void displayDriveInfo() {
         System.out.println("Car Make: " + make);
         System.out.println("Car Model: " + model);
         System.out.println("Car Year: " + year);
     }
 }

