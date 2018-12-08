package image;
import javafx.scene.paint.Color;
import java.util.HashMap;

public class Rectangle implements Shape {

    private Color color;
    private int width;
    private int height;
    private Point leftHigh;

    public Rectangle(int x, int y, int width, int height, Color color) {

        this.width = width;
        this.height = height;
        this.color = color;
        this.leftHigh = new Point(x, y);
    }

    public boolean contains(Point point){

        boolean width = (leftHigh. x <= point.x && point.x <= leftHigh.x + this.width);
        boolean height = (leftHigh.y <= point.y && point.y <= leftHigh.y + this.height);
        return (width && height);
    }

    public Color getColor(){

        return this.color;
    }

}
