public class Line {
    int a;
    int b;
    int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double calculateSlope() {
        return (double) -a / b;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
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
}