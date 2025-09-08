public class PaintingTester {

    public static void main(String[] args){
        System.out.println("Hi");
        Painting period1Painting = new Painting();
        Painting period1Painting2 = new Painting();
        System.out.println(period1Painting.toString());
        System.out.println(period1Painting2.toString());
        period1Painting2.stain();
        period1Painting2.repaint();
        period1Painting2.fall();
        period1Painting2.shatter();
        period1Painting2.takeDownPaintings((4));
        period1Painting.stain();
        period1Painting.repaint();
        period1Painting.fall();
        period1Painting.shatter();
        period1Painting.takeDownPaintings((4));
        System.out.println(period1Painting2.toString());
        System.out.println(period1Painting.toString());
        System.out.println(period1Painting.equals(period1Painting2));
    }
}
