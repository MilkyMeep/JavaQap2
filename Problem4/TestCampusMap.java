package Problem4;

/**
 * Test driver for the CampusMap class that demonstrates a university campus layout
 */
public class TestCampusMap {
    public static void main(String[] args) {
        System.out.println("=== University Campus Map Simulation ===\n");
        
        // Create campus map
        CampusMap campus = new CampusMap();
        
        // Create buildings for the campus
        System.out.println("=== Adding Buildings ===");
        MyRectangle scienceHall = new MyRectangle(200, 200, 400, 400);  // Large central building
        MyRectangle library = new MyRectangle(600, 100, 800, 300);      // Larger rectangular building
        MyRectangle lectureRoom1 = new MyRectangle(100, 500, 180, 580); // Smaller rectangles clustered
        MyRectangle lectureRoom2 = new MyRectangle(200, 500, 280, 580);
        MyRectangle lectureRoom3 = new MyRectangle(300, 500, 380, 580);
        MyRectangle lectureRoom4 = new MyRectangle(400, 500, 480, 580);
        MyRectangle lectureRoom5 = new MyRectangle(500, 500, 580, 580);
        
        // Add buildings to campus
        campus.addBuilding(scienceHall);
        campus.addBuilding(library);
        campus.addBuilding(lectureRoom1);
        campus.addBuilding(lectureRoom2);
        campus.addBuilding(lectureRoom3);
        campus.addBuilding(lectureRoom4);
        campus.addBuilding(lectureRoom5);
        
        // Create central fountain
        System.out.println("\n=== Adding Fountain ===");
        MyCircle centralFountain = new MyCircle(500, 500, 50); // Large central fountain
        campus.addFountain(centralFountain);
        
        // Create walkways connecting buildings
        System.out.println("\n=== Adding Walkways ===");
        
        // Connect Science Hall to other buildings
        campus.addWalkway(scienceHall, library);
        campus.addWalkway(scienceHall, lectureRoom1);
        campus.addWalkway(scienceHall, lectureRoom2);
        campus.addWalkway(scienceHall, lectureRoom3);
        campus.addWalkway(scienceHall, lectureRoom4);
        campus.addWalkway(scienceHall, lectureRoom5);
        
        // Connect Library to lecture rooms
        campus.addWalkway(library, lectureRoom1);
        campus.addWalkway(library, lectureRoom5);
        
        // Connect lecture rooms in sequence
        campus.addWalkway(lectureRoom1, lectureRoom2);
        campus.addWalkway(lectureRoom2, lectureRoom3);
        campus.addWalkway(lectureRoom3, lectureRoom4);
        campus.addWalkway(lectureRoom4, lectureRoom5);
        
        // Test error case: try to add walkway with non-existent building
        System.out.println("\n=== Testing Error Case ===");
        MyRectangle nonExistentBuilding = new MyRectangle(900, 900, 950, 950);
        campus.addWalkway(scienceHall, nonExistentBuilding);
        
        // Calculate and display campus statistics
        System.out.println("\n=== Campus Statistics ===");
        double totalWalkwayLength = campus.calculateTotalWalkwayLength();
        double totalFountainArea = campus.calculateTotalFountainArea();
        
        System.out.printf("Total walkway length: %.2f meters\n", totalWalkwayLength);
        System.out.printf("Total fountain area: %.2f square meters\n", totalFountainArea);
        System.out.println("Number of buildings: " + campus.getBuildings().size());
        System.out.println("Number of walkways: " + campus.getWalkways().size());
        System.out.println("Number of fountains: " + campus.getFountains().size());
        
        // Test walkway connections
        System.out.println("\n=== Walkway Connection Tests ===");
        System.out.println("Walkway from Science Hall to Library: " + 
                          campus.isWalkwayFromTo(scienceHall, library));
        System.out.println("Walkway from Library to Lecture Room 1: " + 
                          campus.isWalkwayFromTo(library, lectureRoom1));
        System.out.println("Walkway from Lecture Room 1 to Lecture Room 5: " + 
                          campus.isWalkwayFromTo(lectureRoom1, lectureRoom5));
        
        // Display building details
        System.out.println("\n=== Building Details ===");
        for (int i = 0; i < campus.getBuildings().size(); i++) {
            MyRectangle building = campus.getBuildings().get(i);
            String buildingName = getBuildingName(i);
            System.out.printf("%s: %s (Area: %d sq m)\n", buildingName, building, building.getArea());
        }
        
        // Display fountain details
        System.out.println("\n=== Fountain Details ===");
        for (MyCircle fountain : campus.getFountains()) {
            System.out.printf("Fountain: %s (Area: %.2f sq m, Circumference: %.2f m)\n", 
                            fountain, fountain.getArea(), fountain.getCircumference());
        }
        
        System.out.println("\n=== Campus Map Simulation Complete ===");
        System.out.println(campus.toString());
    }
    
    /**
     * Helper method to get building names based on index
     * @param index the building index
     * @return the building name
     */
    private static String getBuildingName(int index) {
        switch(index) {
            case 0: return "Science Hall";
            case 1: return "Library";
            case 2: return "Lecture Room 1";
            case 3: return "Lecture Room 2";
            case 4: return "Lecture Room 3";
            case 5: return "Lecture Room 4";
            case 6: return "Lecture Room 5";
            default: return "Building " + (index + 1);
        }
    }
}
