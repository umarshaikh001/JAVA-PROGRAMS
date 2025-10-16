public class AreaCalculator {
    void area(double x) {
        double result = x*x;
        System.out.println("sqrt of area is :" + result);
    }

    void area(double h , double l){
        double result = h*l;
        System.out.println("Rectangel of a area :"+ result);
    } 

    public static void main(String args){
        AreaCalculator obj = new AreaCalculator();

        obj.area(5);
        obj.area(6,4);
    }
    
}
