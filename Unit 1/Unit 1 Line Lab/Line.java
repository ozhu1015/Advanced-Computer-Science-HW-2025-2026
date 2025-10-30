public class Line {
    int a;
    int b;
    int c;
    private Point p1;
    private Point p2;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line() {
        a = generateRandomParameters();
        b = generateRandomParameters();
        c = generateRandomParameters();
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY()); 
        this.b = p2.getX() - p1.getX(); 
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public int generateRandomParameters() {
        double num;
        num = (Math.random() - Math.random());
        return (int) num * 100 + 1;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double calculateSlope() {
        return (double) -a / b;
    }

    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Equation:" + a + "x" + b + "y" + c + "= 0";
    }

    public boolean equals(Line otherline) {
        if (this.a == otherline.a && this.b == otherline.b && this.c == otherline.c) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isParallel(Line otherline) {
        if (this.calculateSlope() == otherline.calculateSlope()) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateSlopeFromPoints() {
        int m = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return m;
    }

    public String generatePointSlopeFormula() {
        String formula = "(y - " + p1.getY() + ") = " 
            + this.calculateSlopeFromPoints() + "(x - " + p1.getX() + ")";
        return formula;
    }
}
