public class TestStaticProperty {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota","Skyactive 10");

        System.out.println(Car.numberOfCars);
        Car car2= new Car("Merc", "Merc 11");
        System.out.println(Car.numberOfCars);
    }
}
