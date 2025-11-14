public class RobotTester {
    public static void main(String[] args) {
        int[] hall = {1, 1, 2, 2};

        Robot robby = new Robot(hall, 2);
        int moveCount = robby.clearHall();

        System.out.println("The total number of moves to clear this hall: " + moveCount);
        
        System.out.println("Did the robot complete the hall with exactly 9 moves? " 
            + (moveCount == 9 ? "Yes." : "No."));

        int[] hall1 = {1, 4, 3, 6, 7};
        int[] hall2 = {1, 4, 3, 6, 5};

        Robot bobby = new Robot(hall1, 3);
        robby.displayState();
        bobby.setPosition(5);
        bobby.setHallway(hall2);
        bobby.displayState();
        System.out.println(bobby.isRobotBlockedByWall());
    }
}