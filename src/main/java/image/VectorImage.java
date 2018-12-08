package image;
import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.List;

public class VectorImage implements Image {

    private HashMap<Point, Color> vector;
    private int width;
    private int height;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.width = width;
        this.height = height;
        vector = new HashMap<Point, Color>();

        for(int x = 0 ; x < width ; x++)
            for(int y = 0 ; y < height ; y++)
                vector.put(new Point(x, y), Color.WHITE);

        for(int x = 0 ; x < width ; x++)
            for(int y = 0 ; y < height ; y++)
                for(int shape = 0; shape < shapes.size(); shape++)
                    if(shapes.get(shape).contains(new Point(x,y)))
                        vector.put(new Point(x, y), shapes.get(shape).getColor());

    }

    public Color getPixelColor(int x, int y){

        return vector.get(new Point(x,y));
    }

    public int getWidth(){

        return this.width;
    }

    public int getHeight(){

        return this.height;
    }

    protected int setWidth(int width){

        return this.width = width;
    }

    protected int setHeight(int height){

        return this.height = height;
    }


}
