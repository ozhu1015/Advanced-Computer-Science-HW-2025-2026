public class PaintingTester {

    public static void main(String[] args){
        System.out.println("Hi");

        Painting period1Painting = new Painting();
        period1Painting.stain();
        period1Painting.repaint();
        period1Painting.fall();
        period1Painting.shatter();
        period1Painting.takeDownPaintings((4));
    }
}
