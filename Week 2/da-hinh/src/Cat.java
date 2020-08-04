public class Cat extends Animal {
    public Cat(){}

    public Cat(double height,double width){
        super(height, width);
    }

    @Override
    public void sound() {

        System.out.println("Meo meo");
    }
}
