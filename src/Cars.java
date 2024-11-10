public class Cars implements Vehicle {

    private String model;
    private int days;
    static final double daily_rate =50;

    public Cars(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return daily_rate*getDays();
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Cars Model:"+getModel());
        System.out.println("Daily Rental Rate:"+daily_rate+"$");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
