public class RectangleTester {
    
    public static void main(String[] args) {
        //Declaration: type name
        //Instantiation/initialization = new type();
        Rectangle period1Rectangle1 = new Rectangle(13, 17); 
        Rectangle period1Rectangle2 = new Rectangle(201);

        System.out.println(period1Rectangle1.toString());
        System.out.println(period1Rectangle2.toString());

        period1Rectangle1.setLength(7);
        period1Rectangle2.setWidth(9);

        System.out.println(period1Rectangle1.toString());
        System.out.println(period1Rectangle2.toString());

        if (period1Rectangle1.equals(period1Rectangle2)) {
            System.out.println("The rectangles are the same.");
        } else {
            System.out.println("The rectangles are different.");
        }

        System.out.println("The diagonal of rectangle 1 is" + period1Rectangle1.getDiagonal());
        System.out.println("The diagonal of rectangle 2 is" + period1Rectangle2.getDiagonal());
    }
}
