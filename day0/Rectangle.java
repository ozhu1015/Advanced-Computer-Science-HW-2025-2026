public class Rectangle {
    private int length;
    private int width;

    //constructors
    //general default constructor
    //constructor always has to match the name of the class
    public Rectangle() {
        //initialize the private instance variables
        length = 5;
        width = 8;
    }

    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength){
        length = squareSideLength;
        width = squareSideLength;
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

    //methods
    public int calculateArea(){
         int area = length * width;
         return area;
    }

    public int calculatePerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt((length * length) + (width + width));
        return diagonal;
    }
}
