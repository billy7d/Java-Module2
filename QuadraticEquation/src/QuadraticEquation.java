

public class QuadraticEquation {

   double a;
     double b;
    double c;

    double root1;
    double root2;
    double delta;

    public QuadraticEquation(){}

    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminant(){
        delta=  b*b-4*a*c;
        return delta;
    }

    public  double getRoot1() {

        if (delta> 0){
            root1 = ((-b + Math.pow(delta,0.5))/2*a);
        } else if (delta == 0){
            root1 = -b/2*a;
        } else{
            System.out.println("The equation has no roots");
        } return root1;

    }

    public  double getRoot2() {

        if (delta> 0){
            root2 = ((-b - Math.pow(delta,0.5))/2*a);
        } else if (delta == 0){
            root2 = -b/2*a;
        } else{
            System.out.println("The equation has no roots");
        } return root2;

    }

}
