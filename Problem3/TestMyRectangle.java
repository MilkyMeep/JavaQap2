package Problem3;
/**
 * Test driver for the MyRectangle class
 * Tests all public methods in the MyRectangle class
 */
public class TestMyRectangle {
    public static void main(String[] args) {
        System.out.println("=== Testing MyRectangle Class ===\n");

        // Test 1: Default constructor
        System.out.println("Test 1: Testing default constructor");
        MyRectangle rect1 = new MyRectangle();
        System.out.println("Default rectangle: " + rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter() + "\n");

        // Test 2: Constructor with MyPoint objects
        System.out.println("Test 2: Testing constructor with MyPoint objects");
        MyPoint topLeft = new MyPoint(2, 5);
        MyPoint bottomRight = new MyPoint(8, 2);
        MyRectangle rect2 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle with points: " + rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter() + "\n");

        // Test 3: Constructor with coordinates
        System.out.println("Test 3: Testing constructor with coordinates");
        MyRectangle rect3 = new MyRectangle(1, 1, 6, 4);
        System.out.println("Rectangle with coordinates: " + rect3);
        System.out.println("Width: " + rect3.getWidth());
        System.out.println("Height: " + rect3.getHeight());
        System.out.println("Area: " + rect3.getArea());
        System.out.println("Perimeter: " + rect3.getPerimeter() + "\n");

        // Test 4: Testing individual coordinate getters and setters
        System.out.println("Test 4: Testing coordinate getters and setters");
        System.out.println("Rect2 - TopLeftX: " + rect2.getTopLeftX() + ", TopLeftY: " + rect2.getTopLeftY());
        System.out.println("Rect2 - BottomRightX: " + rect2.getBottomRightX() + ", BottomRightY: " + rect2.getBottomRightY());
        
        rect2.setTopLeftX(0);
        rect2.setTopLeftY(10);
        rect2.setBottomRightX(15);
        rect2.setBottomRightY(0);
        System.out.println("After setting new coordinates:");
        System.out.println("Rect2: " + rect2);
        System.out.println("New area: " + rect2.getArea() + "\n");

        // Test 5: Testing setTopLeftXY and setBottomRightXY
        System.out.println("Test 5: Testing setTopLeftXY and setBottomRightXY");
        rect2.setTopLeftXY(3, 8);
        rect2.setBottomRightXY(12, 3);
        System.out.println("After setTopLeftXY and setBottomRightXY: " + rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight() + "\n");

        // Test 6: Testing point object setters
        System.out.println("Test 6: Testing point object setters");
        MyPoint newTopLeft = new MyPoint(5, 15);
        MyPoint newBottomRight = new MyPoint(20, 5);
        rect2.setTopLeft(newTopLeft);
        rect2.setBottomRight(newBottomRight);
        System.out.println("After setting new point objects: " + rect2);
        System.out.println("TopLeft point: " + rect2.getTopLeft());
        System.out.println("BottomRight point: " + rect2.getBottomRight() + "\n");

        // Test 7: Testing contains method with points
        System.out.println("Test 7: Testing contains method with points");
        MyPoint insidePoint = new MyPoint(10, 10);
        MyPoint outsidePoint = new MyPoint(25, 25);
        System.out.println("Rectangle: " + rect2);
        System.out.println("Point " + insidePoint + " inside rectangle: " + rect2.contains(insidePoint));
        System.out.println("Point " + outsidePoint + " inside rectangle: " + rect2.contains(outsidePoint) + "\n");

        // Test 8: Testing contains method with rectangles
        System.out.println("Test 8: Testing contains method with rectangles");
        MyRectangle smallRect = new MyRectangle(8, 12, 15, 8);
        MyRectangle largeRect = new MyRectangle(0, 20, 25, 0);
        System.out.println("Current rectangle: " + rect2);
        System.out.println("Small rectangle: " + smallRect);
        System.out.println("Small rectangle contained in current: " + rect2.contains(smallRect));
        System.out.println("Large rectangle: " + largeRect);
        System.out.println("Large rectangle contained in current: " + rect2.contains(largeRect) + "\n");

        // Test 9: Testing edge cases
        System.out.println("Test 9: Testing edge cases");
        
        MyRectangle square = new MyRectangle(0, 0, 5, 5);
        System.out.println("Square: " + square);
        System.out.println("Square width: " + square.getWidth() + ", height: " + square.getHeight());
        System.out.println("Square area: " + square.getArea() + ", perimeter: " + square.getPerimeter());
        
        // Single point rectangle
        MyRectangle pointRect = new MyRectangle(3, 3, 3, 3);
        System.out.println("Point rectangle: " + pointRect);
        System.out.println("Point rectangle area: " + pointRect.getArea() + ", perimeter: " + pointRect.getPerimeter() + "\n");

        // Test 10: Testing toString method
        System.out.println("Test 10: Testing toString method");
        System.out.println("Rect1 toString: " + rect1.toString());
        System.out.println("Rect2 toString: " + rect2.toString());
        System.out.println("Rect3 toString: " + rect3.toString());

        System.out.println("\n=== All MyRectangle tests completed successfully! ===");
    }
}