package image;
import static util.Matrices.*;
import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    private int width;
    private int height;
    private Color [][] pixels;

    public PaletteRasterImage(Color color, int width, int height) {

        this.height = height;
        this.width = width;
        pixels = new Color [width][height];
        for (int x = 0; x < height; x++)
            for (int y = 0; y < width; y++)
                this.pixels [x][y] = color;
    }

    public PaletteRasterImage(Color[][] pixels) {

        this.pixels = pixels;
        this.height = getColumnCount(pixels);
        this.width = getRowCount(pixels);

    }

    public void createRepresentation(){

        pixels = new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){

        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y){

        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){

        for ( int x = 0; x < getColumnCount(pixels); x++)
            for (int y = 0; y < getRowCount(pixels); y++)
                this.pixels[x][y] = pixels [x][y];
    }

    private void setPixelsColor(Color color){

        for ( int x = 0; x < height; x++)
            for ( int y = 0; y < width; y++)
                pixels[x][y] = color;
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
