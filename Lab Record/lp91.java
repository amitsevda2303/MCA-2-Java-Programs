// 91.	Write a program to calculate the area of a circle using a lambda expression.
interface CircleArea {
    double calculate(double radius);
}

public class lp91 {
    public static void main(String[] args) {
        // Lambda expression to calculate area (πr²)
        CircleArea area = r -> Math.PI * r * r;

        double radius = 5.0;
        System.out.println("Area of Circle: " + area.calculate(radius));
    }
}
