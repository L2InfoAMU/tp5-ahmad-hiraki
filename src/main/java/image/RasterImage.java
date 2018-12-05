package image;
import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {

    public abstract void createRepresentation();

    public abstract void setPixelColor(Color color, int x, int y);

    public abstract Color getPixelColor(int x, int y);

    public abstract int getWidth();

    public abstract int getHeight();

    protected abstract void setWidth(int width);

    protected abstract void setHeight(int height);
}
