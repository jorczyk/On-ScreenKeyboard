import processing.core.PApplet;

public class RoundButton extends MyPApplet {

    String text;
    Position position;
    int diameter;
    boolean focused = false;

    RoundButton (String text, int x, int y, int diameter) {
        this.text = text;
        this.position = new Position(x,y);
        this.diameter = diameter;
    }

    RoundButton (String text, Position position, int diameter) {
        this.text = text;
        this.position = position;
        this.diameter = diameter;
    }

    boolean isMoseOverIt() {
        float disX = position.getX() - mouseX;
        float disY = position.getY() - mouseY;
        return sqrt(sq(disX) + sq(disY)) < diameter / 2;
    }

    void drawIt() {
        //stroke(0);
        fill(Color.GREY);
        ellipse(position.getX(), position.getY(), this.diameter, this.diameter);
        fill(Color.YELLOW);
        text(this.text, position.getX(), position.getY()-10);
    }

    @Override
    public String toString() {
        return "RoundButton{" +
                "text='" + text + '\'' +
                ", position=" + position +
                '}';
    }
}
