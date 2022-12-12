public class Rectangle implements Comparable<Rectangle>{
    private float length;
    private float width;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    public float getSquare() {
        return length * width;
    }

    @Override
    public int compareTo(Rectangle rectangle) {
        if (this.getSquare() == rectangle.getSquare()) {
            return 0;
        } else if (this.getSquare() < rectangle.getSquare()) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean isSimilar(Rectangle rectangle) {
        return (rectangle.length > 0 && rectangle.width > 0) && ((this.length / rectangle.length) == (this.width / rectangle.width));
    }
}
