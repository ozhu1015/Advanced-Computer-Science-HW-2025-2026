public class Rectangle {
    private int length;
    private int width;
    private Point Point1;
    private Point Point2;
    private Point Point3;
    private Point Point4;
    private double degrees;

    //constructors
    //general default constructor
    //constructor always has to match the name of the class
    public Rectangle() {
        //initialize the private instance variables
        length = 5;
        width = 8;

        Point1 = new Point(0, 0);
        Point2 = new Point(0, width);
        Point3 = new Point(length, 0);
        Point4 = new Point(length, width);
    }

    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;

        Point1 = new Point(0, 0);
        Point2 = new Point(0, width);
        Point3 = new Point(length, 0);
        Point4 = new Point(length, width);
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;

        Point1 = new Point(0, 0);
        Point2 = new Point(0, width);
        Point3 = new Point(length, 0);
        Point4 = new Point(length, width);
    }

    //getters let you get the private instance variables from the class
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //setters let us change the things in the class
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public String toString() {
        return "This rectangle has a length of "
            + length
            + " and a width of " 
            + width 
            + ". Its area is "
            + getArea() 
            + "."
            + "Its perimeter is " 
            + getPerimeter()
            + " and its diagonal is "
            + getDiagonal() 
            + ".";
    }

    public boolean equals(Rectangle otherRectangle) {
        if (this.length == otherRectangle.length && this.width == otherRectangle.width) {
            return true;
        } else {
            return false;
        }
    }
    //methods

    public int getArea() {
        int area = length * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;
    }
}
