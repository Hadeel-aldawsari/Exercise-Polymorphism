import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner input =new Scanner(System.in);
        int choise=0;

        do{
            System.out.println("Vehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5.Exit");
            System.out.print("Enter your choise:");
            choise=input.nextInt();
            switch (choise){
                case 1:
                    input.nextLine();
                    System.out.print("Enter car Model:");
                    String model=input.nextLine();
                    System.out.print("Enter Rental Days:");
                    int days=input.nextInt();
                    Vehicle car=new Cars(model,days);
                    rentedVehicles.add(car);
                    car.displayDetails();
                    System.out.println("Rental Cost:"+car.calculateRentalCost()+"$\n");
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Enter Bike brand:");
                    String brand=input.nextLine();
                    System.out.print("Enter Rental Hours:");
                    int hours=input.nextInt();
                    Vehicle bike=new Bikes(brand,hours);
                    rentedVehicles.add(bike);
                    bike.displayDetails();
                    System.out.println("Rental Cost:"+bike.calculateRentalCost()+"$\n");
                    break;
                case 3:
                    input.nextLine();
                    System.out.print("Enter Truck type:");
                    String type=input.nextLine();
                    System.out.print("Enter Rental week:");
                    int week=input.nextInt();
                    Vehicle truck=new Trucks(type,week);
                    rentedVehicles.add(truck);
                    truck.displayDetails();
                    System.out.println("Rental Cost:"+truck.calculateRentalCost()+"$\n");

                    break;
                case 4:
                    if (rentedVehicles.isEmpty()){
                        System.out.println("There is no rented Vehicles found");
                        break;
                    }
                    for (Vehicle v:rentedVehicles){
                       v.displayDetails();
                        System.out.println("Rental Cost:"+v.calculateRentalCost()+"$");
                        System.out.println("-----");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice,Please try again.");

            }

        }while (choise!=5);


        System.out.println("Thank you for using the Vehicle Rental System!");


    }

}