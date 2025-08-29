public class Painting {
    private int numPaintings;
    private double width;
    private String frame;
    private String background;
    private boolean isLandscape;
    private char orderPainting;
    private boolean onWall;

    public Painting(){
        numPaintings = 6;
        width = 21.8;
        frame = "Wood";
        background = "White";
        isLandscape = true;
        orderPainting = 'A';
        onWall = true;

    }

    public void fall(){
        onWall = false;
        System.out.println("The painting was knocked over!");
    }

    public void shatter(){
        numPaintings -= 1;
        System.out.println("One painting was destroyed. There are " + numPaintings + " paintings now.");

    } 

    public void stain(){
        isLandscape = false;
        System.out.println("The painting has been stained.");
    }

    public void repaint(){
        background = "Black";
        System.out.println("The painting has a black background now.");
    }
}