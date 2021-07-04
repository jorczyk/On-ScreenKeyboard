public class Key {

    private String displayName;
    private String shiftName;
    private String altName;
    private String output;

    public Key(String displayName, String shiftName, String altName, String output) {
        this.displayName = displayName;
        this.shiftName = shiftName;
        this.altName = altName;
        this.output = output;
    }

    public Key(String displayName, String shiftName, String altName) {
        this.displayName = displayName;
        this.shiftName = shiftName;
        this.altName = altName;
        this.output = null;
    }
}
