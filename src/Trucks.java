public class Trucks implements Vehicle{
    static final int weekly_rate=500;
private String type;
private int week;

    public Trucks(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int days) {
        this.week = days;
    }

    @Override
    public double calculateRentalCost() {
     return weekly_rate*getWeek();

    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Trucks type:"+getType());
        System.out.println("weekly Rental Rate:"+weekly_rate+"$");

    }
}
