package image;
import java.awt.*;
import static util.Matrices.*;
import javafx.scene.paint.Color;

public class BruteRasterImage extends RasterImage {

    private int width;
    private int height;
    private Color [][] colors;

    public BruteRasterImage (Color color, int width ,int height){

        this.width = width;
        this.height = height;
        colors = new Color[height][width];
        for (int x = 0; x < height; x++)
            for (int y = 0; y < width; y++)
                this.colors [x][y] = color;

    }

    public BruteRasterImage ( Color[][] colors){

        this.colors = colors ;
        this.height = getColumnCount(colors);
        this.width = getRowCount(colors);
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
    }

    public void createRepresentation(){

        colors = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){

        colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y){

       return colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){

        for ( int x = 0; x < getColumnCount(colors); x++)
            for (int y = 0; y < getRowCount(colors); y++)
                this.colors[x][y] = colors [x][y];
    }

    private void setPixelsColor(Color color){

        for ( int x = 0; x < height; x++)
            for ( int y = 0; y < width; y++)
                colors[x][y] = color;
    }

    public int getWidth(){

        return this.width;
    }

    public int getHeight(){

        return this.height;
    }

    protected void setWidth(int width){

        this.width = width;
    }

    protected void setHeight(int height){

        this.height = height;
    }



}
