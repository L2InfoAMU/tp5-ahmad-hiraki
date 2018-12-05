package image;
import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.List;
import static util.Matrices.*;
import static util.Matrices.requiresRectangularMatrix;

public class SparseRasterImage extends RasterImage {

    private HashMap<Point, Color> sparse;
    private int height;
    private int width;

    public SparseRasterImage(Color color, int width, int height){

        this.height = height;
        this.width = width;
        createRepresentation();
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels){

        this.height = getColumnCount(pixels);
        this.width = getRowCount(pixels);
        createRepresentation();
        setPixelsColor(pixels);
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
    }

    @Override
    public void createRepresentation() {

        sparse = new HashMap<Point, Color>();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {

        sparse.put(new Point(x, y), color);
    }

    private void setPixelsColor(Color[][] pixels){

        for ( int x = 0; x < getRowCount(pixels); x++)
            for (int y = 0; y < getColumnCount(pixels); y++)
                 sparse.put(new Point(x, y), pixels[x][y]);
    }

    private void setPixelsColor(Color color){

        for ( int x = 0; x < height; x++)
            for ( int y = 0; y < width; y++)
                sparse.put(new Point(x, y), color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return sparse.get(new Point(x, y));
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    protected void setWidth(int width) {

        this.width = width;
    }

    @Override
    protected void setHeight(int height) {

        this.height = height;
    }
}
