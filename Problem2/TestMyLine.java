package Problem2;
/**
 * Tests all public methods in the MyLine class
 */
public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("=== Testing MyLine Class ===\n");

        // Test 1: Constructor with coordinates
        System.out.println("Test 1: Testing constructor with coordinates");
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println("Line 1: " + line1);
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient() + " radians\n");

        // Test 2: Constructor with MyPoint objects
        System.out.println("Test 2: Testing constructor with MyPoint objects");
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(3, 4);
        MyLine line2 = new MyLine(begin, end);
        System.out.println("Line 2: " + line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient() + " radians\n");

        // Test 3: Testing individual coordinate getters and setters
        System.out.println("Test 3: Testing coordinate getters and setters");
        System.out.println("Line 1 - BeginX: " + line1.getBeginX() + ", BeginY: " + line1.getBeginY());
        System.out.println("Line 1 - EndX: " + line1.getEndX() + ", EndY: " + line1.getEndY());
        
        line1.setBeginX(10);
        line1.setBeginY(20);
        line1.setEndX(30);
        line1.setEndY(40);
        System.out.println("After setting new coordinates:");
        System.out.println("Line 1: " + line1 + "\n");

        // Test 4: Testing setBeginXY and setEndXY
        System.out.println("Test 4: Testing setBeginXY and setEndXY");
        line1.setBeginXY(5, 5);
        line1.setEndXY(15, 15);
        System.out.println("After setBeginXY and setEndXY: " + line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient() + " radians\n");

        // Test 5: Testing point object setters
        System.out.println("Test 5: Testing point object setters");
        MyPoint newBegin = new MyPoint(100, 200);
        MyPoint newEnd = new MyPoint(400, 500);
        line1.setBegin(newBegin);
        line1.setEnd(newEnd);
        System.out.println("After setting new point objects: " + line1);
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd() + "\n");

        // Test 6: Testing edge cases
        System.out.println("Test 6: Testing edge cases");
        
    
        MyLine verticalLine = new MyLine(0, 0, 0, 10);
        System.out.println("Vertical line: " + verticalLine);
        System.out.println("Vertical line length: " + verticalLine.getLength());
        System.out.println("Vertical line gradient: " + verticalLine.getGradient() + " radians");
        
       
        MyLine horizontalLine = new MyLine(0, 0, 10, 0);
        System.out.println("Horizontal line: " + horizontalLine);
        System.out.println("Horizontal line length: " + horizontalLine.getLength());
        System.out.println("Horizontal line gradient: " + horizontalLine.getGradient() + " radians");
        
        MyLine pointLine = new MyLine(5, 5, 5, 5);
        System.out.println("Point line: " + pointLine);
        System.out.println("Point line length: " + pointLine.getLength());
        System.out.println("Point line gradient: " + pointLine.getGradient() + " radians\n");

        System.out.println("Test 7: Testing toString method");
        System.out.println("Line 1 toString: " + line1.toString());
        System.out.println("Line 2 toString: " + line2.toString());

        System.out.println("\n=== All tests completed successfully! ===");
    }
}
