import processing.core.PApplet;
import processing.core.PFont;

public class MyPApplet extends PApplet {

    private static PFont font;

    final void fill(Color color) {
        fill(color.r, color.g, color.b);
    }

    final void stroke(Color color) {
        stroke(color.r, color.g, color.b);
    }

    final void background(Color color) {
        background(color.r, color.g, color.b);
    }

    final void sceneSize(int width, float proportions) {
        int height = Math.round(width/proportions);
        size(width, height);
    }

    final PFont getFont() {
        if(font == null) {
            font = createFont("Sylfaen", 30);
        }
        return font;
    }


}
