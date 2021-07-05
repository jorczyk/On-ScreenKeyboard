public class Key {

    private final String displayName;
    private final String shiftName;
    private final String altName;
    private final String shiftAltName;
    private final Color color;
    private final Color altColor;
    private final boolean latch;
    String currentText = null;

    public Key(String displayName, String shiftName, String altName, String shiftAltName) {
        this.displayName = displayName;
        this.shiftName = shiftName;
        this.altName = altName;
        this.shiftAltName = shiftAltName;
        this.color = Color.LIGHT_GREY;
        this.altColor = Color.GREY;
        this.latch = false;
    }

    public Key(String displayName, String shiftName) {
        this.displayName = displayName;
        this.shiftName = shiftName;
        this.altName = displayName;
        this.shiftAltName = shiftName;
        this.color = Color.LIGHT_GREY;
        this.altColor = Color.GREY;
        this.latch = false;
    }

    public Key(String displayName, Color color, Color altColor, boolean latch) {
        this.displayName = displayName;
        this.shiftName = displayName;
        this.altName = displayName;
        this.shiftAltName = displayName;
        this.color = color;
        this.altColor = altColor;
        this.latch = latch;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getShiftName() {
        return shiftName;
    }

    public String getAltName() {
        return altName;
    }

    public String getShiftAltName() {
        return shiftAltName;
    }

    public Color getColor() {
        return color;
    }

    public Color getAltColor() {
        return altColor;
    }

    public boolean isLatch() {
        return latch;
    }
}
