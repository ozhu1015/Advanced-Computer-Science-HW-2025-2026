public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right
    
    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = fixHallway(hallwayToClean);
        this.position = fixPosition(startingPosition);
        this.isFacingRight = true;
    }

    public int[] fixHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        return hallway;
    }

    public int fixPosition(int position) {
        if (position > hallway.length - 1) {
            return hallway.length - 1;
        } else if (position < 0) {
            return 0;
        } else {
            return position;
        }
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = fixHallway(hallway);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = fixPosition(position);
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (position == 0 && isFacingRight() == false || position == hallway.length - 1 && isFacingRight) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position] -= 1;
        }
        if (hallway[position] > 0) {
            position += 0;
        } else if (isFacingRight) {
            if (isRobotBlockedByWall()) {
                isFacingRight = false;
            } else {
                position += 1;
            }
        } else {
            if (isRobotBlockedByWall()) {
                isFacingRight = true;
            } else {
                position -= 1;
            }
        }

    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (this.hallIsClear() == false) {
            this.move();
            count += 1;
            System.out.println("Move:" + count);
            this.displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.print("\n");
        int spaces = 2 * (position - 1);
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        if (isFacingRight) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }


    }
}
