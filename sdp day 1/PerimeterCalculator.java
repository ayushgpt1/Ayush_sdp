public class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}

public class PerimeterCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setBreadth(20);
        rect.calculatePerimeter();
    }
}