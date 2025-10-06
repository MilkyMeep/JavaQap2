package Problem2;
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    /**
     * Constructor that creates a line with specified coordinates
     * @param x1 x-coordinate of begin point
     * @param y1 y-coordinate of begin point
     * @param x2 x-coordinate of end point
     * @param y2 y-coordinate of end point
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    /**
     * Constructor that creates a line with specified begin and end points
     * @param begin the begin point
     * @param end the end point
     */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * Gets the begin point
     * @return the begin point
     */
    public MyPoint getBegin() {
        return begin;
    }

    /**
     * Sets the begin point
     * @param begin the new begin point
     */
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    /**
     * Gets the end point
     * @return the end point
     */
    public MyPoint getEnd() {
        return end;
    }

    /**
     * Sets the end point
     * @param end the new end point
     */
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    /**
     * Gets the x-coordinate of begin point
     * @return x-coordinate of begin point
     */
    public int getBeginX() {
        return begin.getX();
    }

    /**
     * Sets the x-coordinate of begin point
     * @param x the new x-coordinate for begin point
     */
    public void setBeginX(int x) {
        begin.setX(x);
    }

    /**
     * Gets the y-coordinate of begin point
     * @return y-coordinate of begin point
     */
    public int getBeginY() {
        return begin.getY();
    }

    /**
     * Sets the y-coordinate of begin point
     * @param y the new y-coordinate for begin point
     */
    public void setBeginY(int y) {
        begin.setY(y);
    }

    /**
     * Gets the x-coordinate of end point
     * @return x-coordinate of end point
     */
    public int getEndX() {
        return end.getX();
    }

    /**
     * Sets the x-coordinate of end point
     * @param x the new x-coordinate for end point
     */
    public void setEndX(int x) {
        end.setX(x);
    }

    /**
     * Gets the y-coordinate of end point
     * @return y-coordinate of end point
     */
    public int getEndY() {
        return end.getY();
    }

    /**
     * Sets the y-coordinate of end point
     * @param y the new y-coordinate for end point
     */
    public void setEndY(int y) {
        end.setY(y);
    }

    /**
     * Sets the begin point coordinates
     * @param x the x-coordinate for begin point
     * @param y the y-coordinate for begin point
     */
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    /**
     * Sets the end point coordinates
     * @param x the x-coordinate for end point
     * @param y the y-coordinate for end point
     */
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    /**
     * Calculates the length of the line using MyPoint's distance method
     * @return the length of the line
     */
    public double getLength() {
        return begin.distance(end);
    }

    /**
     * Calculates the gradient (slope) of the line in radians using Math.atan2
     * @return the gradient in radians
     */
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    /**
     * Returns a string representation of the line
     * @return string in the format "MyLine[begin=(x1,y1),end=(x2,y2)]"
     */
    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
