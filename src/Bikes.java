public class Bikes implements Vehicle{

 static final int hourly_rate=10;
 private String brand;
 private int hour;


    public Bikes(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hourly_rate*getHour();
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Bike brand:"+getBrand());
        System.out.println("Hourly Rental Rate:"+hourly_rate+"$");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
