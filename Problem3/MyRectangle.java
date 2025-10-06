 package Problem3;
 public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Default constructor that creates a rectangle from (0,0) to (1,1)
     */
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    /**
     * Constructor that creates a rectangle with specified top-left and bottom-right points
     * @param topLeft the top-left corner point
     * @param bottomRight the bottom-right corner point
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Constructor that creates a rectangle with specified coordinates
     * @param x1 x-coordinate of top-left corner
     * @param y1 y-coordinate of top-left corner
     * @param x2 x-coordinate of bottom-right corner
     * @param y2 y-coordinate of bottom-right corner
     */
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    /**
     * Gets the top-left corner point
     * @return the top-left corner point
     */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /**
     * Sets the top-left corner point
     * @param topLeft the new top-left corner point
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Gets the bottom-right corner point
     * @return the bottom-right corner point
     */
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /**
     * Sets the bottom-right corner point
     * @param bottomRight the new bottom-right corner point
     */
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * Gets the x-coordinate of top-left corner
     * @return x-coordinate of top-left corner
     */
    public int getTopLeftX() {
        return topLeft.getX();
    }

    /**
     * Sets the x-coordinate of top-left corner
     * @param x the new x-coordinate for top-left corner
     */
    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    /**
     * Gets the y-coordinate of top-left corner
     * @return y-coordinate of top-left corner
     */
    public int getTopLeftY() {
        return topLeft.getY();
    }

    /**
     * Sets the y-coordinate of top-left corner
     * @param y the new y-coordinate for top-left corner
     */
    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    /**
     * Gets the x-coordinate of bottom-right corner
     * @return x-coordinate of bottom-right corner
     */
    public int getBottomRightX() {
        return bottomRight.getX();
    }

    /**
     * Sets the x-coordinate of bottom-right corner
     * @param x the new x-coordinate for bottom-right corner
     */
    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    /**
     * Gets the y-coordinate of bottom-right corner
     * @return y-coordinate of bottom-right corner
     */
    public int getBottomRightY() {
        return bottomRight.getY();
    }

    /**
     * Sets the y-coordinate of bottom-right corner
     * @param y the new y-coordinate for bottom-right corner
     */
    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    /**
     * Sets the top-left corner coordinates
     * @param x the x-coordinate for top-left corner
     * @param y the y-coordinate for top-left corner
     */
    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    /**
     * Sets the bottom-right corner coordinates
     * @param x the x-coordinate for bottom-right corner
     * @param y the y-coordinate for bottom-right corner
     */
    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    /**
     * Calculates the width of the rectangle
     * @return the width of the rectangle
     */
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    /**
     * Calculates the height of the rectangle
     * @return the height of the rectangle
     */
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    /**
     * Calculates the area of the rectangle
     * @return the area of the rectangle
     */
    public int getArea() {
        return getWidth() * getHeight();
    }

    /**
     * Calculates the perimeter of the rectangle
     * @return the perimeter of the rectangle
     */
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    /**
     * Checks if a point is inside the rectangle
     * @param point the point to check
     * @return true if the point is inside the rectangle, false otherwise
     */
    public boolean contains(MyPoint point) {
        int x = point.getX();
        int y = point.getY();
        int minX = Math.min(topLeft.getX(), bottomRight.getX());
        int maxX = Math.max(topLeft.getX(), bottomRight.getX());
        int minY = Math.min(topLeft.getY(), bottomRight.getY());
        int maxY = Math.max(topLeft.getY(), bottomRight.getY());
        
        return (x >= minX && x <= maxX && y >= minY && y <= maxY);
    }

    /**
     * Checks if this rectangle contains another rectangle
     * @param another the other rectangle to check
     * @return 
     */
    public boolean contains(MyRectangle another) {
        return this.contains(another.getTopLeft()) && this.contains(another.getBottomRight());
    }

    /**
     * Returns a string representation of the rectangle
     * @return string in the format "MyRectangle[topLeft=(x1,y1),bottomRight=(x2,y2)]"
     */
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + "]";
    }
}