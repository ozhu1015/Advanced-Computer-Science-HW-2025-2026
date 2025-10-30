public class LineTester {

    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        Line pointLine = new Line(p1, p2);
        System.out.println("Slope is: " + pointLine.calculateSlope());
        System.out.println("Slope is: " + pointLine.calculateSlopeFromPoints());
        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("The slopes are equal");
        } else {
            System.out.println("The slopes are not equal");
        }

        System.out.println("Is point p1 on line? " + pointLine.isCoordinateOnLine(p1));
        System.out.println("Is point p2 on line? " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Is point p3 on line? " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Is point p4 on line? " + pointLine.isCoordinateOnLine(p4));
    }
}
