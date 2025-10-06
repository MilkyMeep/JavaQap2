package Problem4;

/**
 * The MyCircle class represents a circle with a center point and radius.
 */
public class MyCircle {
    private MyPoint center;
    private double radius;

    /**
     * Default constructor that creates a circle at (0,0) with radius 1
     */
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1.0;
    }

    /**
     * Constructor that creates a circle with specified center and radius
     * @param center the center point of the circle
     * @param radius the radius of the circle
     */
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Constructor that creates a circle with specified coordinates and radius
     * @param x x-coordinate of center
     * @param y y-coordinate of center
     * @param radius the radius of the circle
     */
    public MyCircle(int x, int y, double radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    /**
     * Gets the center point
     * @return the center point
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * Sets the center point
     * @param center the new center point
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /**
     * Gets the radius
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the x-coordinate of center
     * @return x-coordinate of center
     */
    public int getCenterX() {
        return center.getX();
    }

    /**
     * Sets the x-coordinate of center
     * @param x the new x-coordinate for center
     */
    public void setCenterX(int x) {
        center.setX(x);
    }

    /**
     * Gets the y-coordinate of center
     * @return y-coordinate of center
     */
    public int getCenterY() {
        return center.getY();
    }

    /**
     * Sets the y-coordinate of center
     * @param y the new y-coordinate for center
     */
    public void setCenterY(int y) {
        center.setY(y);
    }

    /**
     * Sets the center coordinates
     * @param x the x-coordinate for center
     * @param y the y-coordinate for center
     */
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    /**
     * Calculates the area of the circle
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle
     * @return the circumference of the circle
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the circle
     * @return string in the format "MyCircle[center=(x,y),radius=r]"
     */
    public String toString() {
        return "MyCircle[center=" + center.toString() + ",radius=" + radius + "]";
    }
}