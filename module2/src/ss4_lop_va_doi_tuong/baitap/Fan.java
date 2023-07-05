package ss4_lop_va_doi_tuong.baitap;

public class Fan {
    private final int Slow = 1 ;
    private final int Medium = 2 ;
    private final int Fast = 3 ;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = Slow;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - Fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + " - Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
