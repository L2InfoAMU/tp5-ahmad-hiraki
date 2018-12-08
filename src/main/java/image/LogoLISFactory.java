package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LogoLISFactory implements ImageFactory{
    @Override
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        Color greenblue = Color.rgb(113,208,199);

        int[] xCoordinates = {400, 0,   400, 660, 60,  720, 660};
        int[] yCoordinates = {0,   0,   140, 0, 0,   60,  140};
        int[] widths =       {60,  200, 60,  200, 140, 140, 140};
        int[] heights =      {80,  340, 200, 340, 280, 80,  140};
        Color[] colors = {greenblue, dark, dark, dark, Color.WHITE, Color.WHITE, Color.WHITE};

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i<colors.length; i++)
            list.add(new Rectangle(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i]));

        return new VectorImage(list, 860, 340);
    }
}