import java.util.Scanner;

// ShapeDemo class to demonstrate polymorphism with Shapes
public class ShapeDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of Shape objects with size 5
        // Hint: Shape[] shapes = new Shape[5];
        Shape[] shapes = new Shape[5];
        
        // Step 2: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Step 3: Create an interactive menu to add shapes to the array
        // Hint: Use a loop and a counter to keep track of how many shapes are added
        // The menu should allow users to:
        // 1. Add a Circle
        // 2. Add a Rectangle
        // 3. Add a Triangle
        // 4. Display all shapes
        // 5. Exit
        String color;
        int shapesCount = 0;
        while(true){
            try{
                System.out.println("Select an option from the menu:");
                System.out.println("1 - Add a circle \n2- Add a Rectangle \n3 - Add a Triangle \n4 - Display all shapes \n5 Exit");
                int selectedMenuOption = Integer.parseInt(scanner.nextLine());
                if(selectedMenuOption <0){
                    throw new NumberFormatException();
                }
                if(selectedMenuOption <4 && shapesCount >= 5){
                    System.out.println("Shape array is full");
                }
                else{

                    switch (selectedMenuOption){
                        case 1:
                            System.out.println("Enter circle color");
                            color = scanner.nextLine();
                            System.out.println("Enter circle radius");
                            double radius = Double.parseDouble(scanner.nextLine());
                            Circle c = new Circle(color,radius);
                            shapes[shapesCount++] = c;
                            break;
                        case 2:
                            System.out.println("Enter rectangle color");
                            color = scanner.nextLine();
                            System.out.println("Enter rectangle width");
                            double width = Double.parseDouble(scanner.nextLine());
                            System.out.println("Enter rectangle length");
                            double length = Double.parseDouble(scanner.nextLine());
                            Rectangle r = new Rectangle(color,length,width);
                            shapes[shapesCount++] = r;
                            break;
                        case 3:
                            System.out.println("Enter triangle color");
                            color = scanner.nextLine();
                            System.out.println("Enter triangle first side");
                            double side1 = Double.parseDouble(scanner.nextLine());
                            System.out.println("Enter triangle second side");
                            double side2 = Double.parseDouble(scanner.nextLine());
                            System.out.println("Enter triangle third side");
                            double side3 = Double.parseDouble(scanner.nextLine());
                            Triangle t = new Triangle(color,side1,side2, side3);
                            shapes[shapesCount++] = t;
                            break;
                        case 4:
                            if(shapesCount == 0){
                                System.out.println("No shapes have been added yet");
                            }
                            else {
                                for(int i = 0; i<shapesCount;i++){
                                    System.out.println(shapes[i].toString());
                                    System.out.println("Shape Area: "+shapes[i].area()+"\nShape Perimeter: "+shapes[i].perimeter());
                                }
                            }
                                break;
                        case 5:
                            System.out.println("Goodbye");
                            return;
                        default:
                            throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid option from the menu");
            }

        }
        
        // Step 4: For each shape type, prompt the user for the required attributes
        // For Circle: name, color, radius
        // For Rectangle: name, color, length, width
        // For Triangle: name, color, side1, side2, side3
        
        // Step 5: After adding a shape, display its details
        
        // Step 6: When displaying all shapes, loop through the array and call each shape's
        // toString(), area(), and perimeter() methods
        // This will demonstrate polymorphism as each shape type will use its own implementation
    }
}
