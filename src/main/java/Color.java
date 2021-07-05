public enum Color {
    WHITE(255, 255, 255),
    GREY(128,128,128),
    LIGHT_GREY(168,168,168),
    BLACK(0,0,0),
    RED(255,0,0),
    BLUE(0,0,255),
    GREEN(0,255,0),
    YELLOW(255,255,0),
    LIGHT_YELLOW(200,200,0);

    int r;
    int g;
    int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
