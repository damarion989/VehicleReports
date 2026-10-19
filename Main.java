public class Main {
   public static void main(String[] args) {
     VehicleReport truck = new TruckReport();
     VehicleReport bike = new BikeReport();

    System.out.println("Truck Report:");
     truck.generateReport();
     
    System.out.println("\nBike Report:");
        bike.generateReport();
    }
}
