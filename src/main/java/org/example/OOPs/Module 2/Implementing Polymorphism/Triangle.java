// Triangle class - a subclass of Shape
public class Triangle extends Shape {
    // Step 1: Declare private variables for the three sides
    // Hint: Use double for side1, side2, and side3
    double side1, side2, side3;
    
    // Step 2: Create a constructor that takes name, color, and three sides as parameters
    // Hint: Use super() to call the parent constructor and then initialize the sides
    public Triangle() {
        super();
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super("Triangle", color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Step 3: Create getter methods for the three sides
    // Hint: public double getSide1(), getSide2(), and getSide3()

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    // Step 4: Override the area() method to calculate the area of a triangle
    // Hint: Use Heron's formula: Area = √(s(s-a)(s-b)(s-c)) where s = (a+b+c)/2

    @Override
    public double area() {
        double s = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
    }


    // Step 5: Override the perimeter() method to calculate the perimeter of a triangle
    // Hint: Perimeter of a triangle = side1 + side2 + side3

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }

    // Step 6: Override toString() method to include triangle-specific information
    // Hint: Call the parent's toString() method and append triangle-specific details


    @Override
    public String toString() {
        return super.toString()+"\side1 :"+this.side1+"\nside2: "+this.side2+"\nside3: "+this.side3;
    }
}
