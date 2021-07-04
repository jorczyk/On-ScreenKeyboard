import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GlobalParams {
    public static final int margin = 0;
    public static final int buttonsDiameter = 45;
    public static final int gap = 70;
    private static final String[] zeroRowButtonsNames = {"`","1","2","3","4","5","6","7","8","9","0","-","="};
    private static final Key[] zeroRowKeys = {
            new Key("`", "~", "`"),
            new Key("1", "!", "1"),
            new Key("2", "@", "2"),
            new Key("3", "#", "3"),
            new Key("4", "$", "4"),
            new Key("5", "%", "5"),
            new Key("6", "^", "6"),
            new Key("7", "&", "7"),
            new Key("8", "*", "8"),
            new Key("9", "(", "9"),
            new Key("0", ")", "0"),
            new Key("-", "_", "-"),
            new Key("=", "+", "=")};

    private static final String[] firstRowButtonsNames = {"q","w","e","r","t","y","u","i","o","p","[","]"};
    private static final String[] secondRowButtonsNames = {"a","s","d","f","g","h","j","k","l",";","'", "\\"};
    private static final String[] thirdRowButtonsNames = {"\\","z","x","c","v","b","n","m",",",".","/"};

    public static List<List<String>> allButtonsNames() {
        List<List<String>> allButtons = new ArrayList<>();
        List<String> zeroRow = Arrays.asList(zeroRowButtonsNames);
        List<String> firstRow = Arrays.asList(firstRowButtonsNames);
        List<String> secondRow = Arrays.asList(secondRowButtonsNames);
        List<String> thirdRow = Arrays.asList(thirdRowButtonsNames);
        allButtons.add(zeroRow);
        allButtons.add(firstRow);
        allButtons.add(secondRow);
        allButtons.add(thirdRow);
        return allButtons;
    }
}
