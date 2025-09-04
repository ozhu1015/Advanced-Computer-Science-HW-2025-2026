public class RectangleTester {
    
    public static void main(String[] args) {
        //Declaration: type name
        //Instantiation/initialization = new type();
        Rectangle shriya = new Rectangle(19, 17); 
        Rectangle samuel = new Rectangle(201);
        Rectangle olivia = new Rectangle(7, 6);

    System.out.println("Width is " + shriya.getWidth());
    
    samuel.setLength(12);

    System.out.println("The new length is " + samuel.getLength());

    System.out.println("Length is " + olivia.getLength());

    System.out.println("Area is " + samuel.calculateArea());

    System.out.println("Perimeter is " + shriya.calculatePerimeter());

    System.out.println("Diagonal is " + olivia.calculateDiagonal());
    }
}
