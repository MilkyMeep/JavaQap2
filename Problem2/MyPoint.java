package Problem2;

public class MyPoint {
    private int x;
    private int y;

    /**
     * Default constructor
     */
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
    
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate
     * @return 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sets both x and y coordinates
     * @param x the new x-coordinate
     * @param y the new y-coordinate
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the point
     * @return string in the format "(x, y)"
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Calculates the distance from this point to another point
     * @param another the other point
     * @return the distance between the two points
     */
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Calculates the distance from this point to the origin (0, 0)
     * @return 
     */
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}