import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GlobalParams {
    public static final int margin = 0;
    public static final int buttonsDiameter = 45;
    public static final int gap = 70;
    private static final Key[] zeroRowKeys = {
            new Key("`", "~"),
            new Key("1", "!"),
            new Key("2", "@"),
            new Key("3", "#"),
            new Key("4", "$"),
            new Key("5", "%"),
            new Key("6", "^"),
            new Key("7", "&"),
            new Key("8", "*"),
            new Key("9", "("),
            new Key("0", ")"),
            new Key("-", "_"),
            new Key("=", "+")};

    private static final Key[] firstRowKeys = {
            new Key("q", "Q"),
            new Key("w", "W"),
            new Key("e", "E", "ę", "Ę"),
            new Key("r", "R"),
            new Key("t", "T"),
            new Key("y", "Y"),
            new Key("u", "U"),
            new Key("i", "I"),
            new Key("o", "O", "ó", "Ó"),
            new Key("p", "P"),
            new Key("[", "{"),
            new Key("]", "}")};

    private static final Key[] secondRowKeys = {
            new Key("a", "A", "ą", "Ą"),
            new Key("s", "S", "ś", "Ś"),
            new Key("d", "D"),
            new Key("f", "F"),
            new Key("g", "G"),
            new Key("h", "H"),
            new Key("j", "J"),
            new Key("k", "K"),
            new Key("l", "L", "ł", "Ł"),
            new Key(";", ":"),
            new Key("'", "\""),
            new Key("\\", "|")};

    private static final Key[] thirdRowKeys = {
            new Key("z", "Z", "ż", "Ż"),
            new Key("x", "X", "ź", "Ź"),
            new Key("c", "C", "ć", "Ć"),
            new Key("v", "V"),
            new Key("b", "B"),
            new Key("n", "N", "ń","Ń"),
            new Key("m", "M"),
            new Key(",", "<"),
            new Key(".", ">"),
            new Key("/", "?")};

    private static final Key[] fourthRowKeys = {
            new Key("Sh", Color.LIGHT_YELLOW, Color.YELLOW, true),
            new Key("Al", Color.LIGHT_YELLOW, Color.YELLOW, true)
    };

    public static List<List<Key>> allKeys() {
        List<List<Key>> allButtons = new ArrayList<>();
        List<Key> zeroRow = Arrays.asList(zeroRowKeys);
        List<Key> firstRow = Arrays.asList(firstRowKeys);
        List<Key> secondRow = Arrays.asList(secondRowKeys);
        List<Key> thirdRow = Arrays.asList(thirdRowKeys);
        List<Key> fourthRow = Arrays.asList(fourthRowKeys);
        allButtons.add(zeroRow);
        allButtons.add(firstRow);
        allButtons.add(secondRow);
        allButtons.add(thirdRow);
        allButtons.add(fourthRow);
        return allButtons;
    }
}
