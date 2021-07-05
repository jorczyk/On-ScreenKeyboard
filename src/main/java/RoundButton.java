import processing.core.PApplet;

public class RoundButton extends MyPApplet {

    Key key;
    Position position;
    int diameter;
    boolean focused = false;

    RoundButton (Key key, Position position, int diameter) {
        this.key = key;
        this.position = position;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "RoundButton{" +
                "text='" + key.getDisplayName() + '\'' +
                ", position=" + position +
                '}';
    }
}
