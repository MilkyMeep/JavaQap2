package Problem4;

import java.util.ArrayList;
import java.util.List;

/**
 * The CampusMap class models a university campus that aggregates buildings, walkways, and fountains.
 * It demonstrates composition and aggregation of geometric objects.
 */
public class CampusMap {
    private List<MyRectangle> buildings;
    private List<MyLine> walkways;
    private List<MyCircle> fountains;

    /**
     * Constructor that initializes empty lists for buildings, walkways, and fountains
     */
    public CampusMap() {
        this.buildings = new ArrayList<>();
        this.walkways = new ArrayList<>();
        this.fountains = new ArrayList<>();
    }

    /**
     * Adds a building to the campus map
     * @param building the building to add
     */
    public void addBuilding(MyRectangle building) {
        buildings.add(building);
        System.out.println("Added building: " + building);
    }

    /**
     * Adds a walkway between two buildings by connecting their centers
     * @param from the starting building
     * @param to the ending building
     */
    public void addWalkway(MyRectangle from, MyRectangle to) {
        // Check if both buildings exist in the campus
        if (!buildings.contains(from)) {
            System.out.println("Error: Building " + from + " not found in campus!");
            return;
        }
        if (!buildings.contains(to)) {
            System.out.println("Error: Building " + to + " not found in campus!");
            return;
        }

        // Calculate center points of both buildings
        int fromCenterX = (from.getTopLeftX() + from.getBottomRightX()) / 2;
        int fromCenterY = (from.getTopLeftY() + from.getBottomRightY()) / 2;
        int toCenterX = (to.getTopLeftX() + to.getBottomRightX()) / 2;
        int toCenterY = (to.getTopLeftY() + to.getBottomRightY()) / 2;

        // Create walkway connecting the centers
        MyLine walkway = new MyLine(fromCenterX, fromCenterY, toCenterX, toCenterY);
        walkways.add(walkway);
        System.out.println("Added walkway from " + from + " to " + to + " (length: " + walkway.getLength() + "m)");
    }

    /**
     * Adds a fountain to the campus map
     * @param fountain the fountain to add
     */
    public void addFountain(MyCircle fountain) {
        fountains.add(fountain);
        System.out.println("Added fountain: " + fountain);
    }

    /**
     * Calculates the total length of all walkways on campus
     * @return the total walkway length in meters
     */
    public double calculateTotalWalkwayLength() {
        double totalLength = 0.0;
        for (MyLine walkway : walkways) {
            totalLength += walkway.getLength();
        }
        return totalLength;
    }

    /**
     * Calculates the total area of all fountains on campus
     * @return the total fountain area in square meters
     */
    public double calculateTotalFountainArea() {
        double totalArea = 0.0;
        for (MyCircle fountain : fountains) {
            totalArea += fountain.getArea();
        }
        return totalArea;
    }

    /**
     * Checks if a walkway exists between two buildings
     * @param fromBuilding the starting building
     * @param toBuilding the ending building
     * @return true if a walkway exists, false otherwise
     */
    public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding) {
        // Calculate center points of both buildings
        int fromCenterX = (fromBuilding.getTopLeftX() + fromBuilding.getBottomRightX()) / 2;
        int fromCenterY = (fromBuilding.getTopLeftY() + fromBuilding.getBottomRightY()) / 2;
        int toCenterX = (toBuilding.getTopLeftX() + toBuilding.getBottomRightX()) / 2;
        int toCenterY = (toBuilding.getTopLeftY() + toBuilding.getBottomRightY()) / 2;

        // Check if any walkway connects these centers (in either direction)
        for (MyLine walkway : walkways) {
            boolean forwardConnection = (walkway.getBeginX() == fromCenterX && walkway.getBeginY() == fromCenterY &&
                                       walkway.getEndX() == toCenterX && walkway.getEndY() == toCenterY);
            boolean reverseConnection = (walkway.getBeginX() == toCenterX && walkway.getBeginY() == toCenterY &&
                                       walkway.getEndX() == fromCenterX && walkway.getEndY() == fromCenterY);
            
            if (forwardConnection || reverseConnection) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the list of buildings
     * @return the list of buildings
     */
    public List<MyRectangle> getBuildings() {
        return buildings;
    }

    /**
     * Gets the list of walkways
     * @return the list of walkways
     */
    public List<MyLine> getWalkways() {
        return walkways;
    }

    /**
     * Gets the list of fountains
     * @return the list of fountains
     */
    public List<MyCircle> getFountains() {
        return fountains;
    }

    /**
     * Returns a string representation of the campus map
     * @return string describing the campus map
     */
    public String toString() {
        return "CampusMap with " + buildings.size() + " buildings, " + 
               walkways.size() + " walkways, and " + 
               fountains.size() + " fountains";
    }
}
