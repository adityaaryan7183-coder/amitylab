//write a java program to calculate area of rectangle using method overloading
public class Area_ovrloding {

    
    
    // Method 1: Calculate area with length and width (most common for rectangle)
    public double area(double length, double width) {
        return length * width;
    }
    
    // Method 2: Calculate area of square (single parameter)
    public double area(double side) {
        return side * side;
    }
    
    // Method 3: Calculate area with integer parameters
    public int area(int length, int width) {
        return length * width;
    }
    
    // Method 4: Calculate area with three parameters (if we consider special rectangle)
    public double area(double length, double width, double scale) {
        return (length * width) * scale;
    }
    
    public static void main(String[] args) {
        Area_ovrloding calculator = new Area_ovrloding();
        
        System.out.println("=== Rectangle Area Calculator using Method Overloading ===\n");
        
        // Using method 1: double length and width
        double area1 = calculator.area(5.5, 8.75);
        System.out.println("Rectangle with length 5.5 and width 8.75: " + area1);
        
        // Using method 2: square (single parameter)
        double area2 = calculator.area(6.0);
        System.out.println("Square with side 6.0: " + area2);
        
        // Using method 3: integer parameters
        int area3 = calculator.area(10, 12);
        System.out.println("Rectangle with length 10 and width 12 (int): " + area3);
        
        // Using method 4: with scale factor
        double area4 = calculator.area(4.0, 5.0, 2.0);
        System.out.println("Rectangle with length 4.0, width 5.0 and scale 2.0: " + area4);
        
        System.out.println("\n=== Method Overloading Benefits ===");
        System.out.println("- Same method name for similar operations");
        System.out.println("- Different parameters for different use cases");
        System.out.println("- Improves code readability and maintainability");
    }
}
