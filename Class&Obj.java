class Car
{
    int speed;
    String color;

    void drive()
    {
        System.out.println("Speed = " + speed);
        System.out.println("Color = " + color);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Car mycar = new Car();
        mycar.speed = 100;
        mycar.color = "red";

        mycar.drive();
    }
}
