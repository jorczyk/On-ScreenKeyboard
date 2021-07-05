import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ButtonsGenerator {

    public Map<Position, RoundButton> generateAllButtons(List<List<Key>> buttonRows, int width) {
        return generateAllButtons(buttonRows, GlobalParams.buttonsDiameter, width);
    }

    public Map<Position, RoundButton> generateAllButtons(List<List<Key>> buttonRows, int diameter, int width) {
        Map<Position, RoundButton> buttonsMap = new HashMap<>();
        int y = 50;
        for(List<Key> row : buttonRows) {
            buttonsMap.putAll(generateButtonsRow(row, y, diameter, GlobalParams.gap, width));
            y += 100;
        }
        return buttonsMap;
    }

    public Map<Position, RoundButton> generateButtonsRow(List<Key> buttonsNames, int y, int diameter, int gap, int width) {
        Map<Position, RoundButton> buttonsMap = new HashMap<>();
        int neededSpace = buttonsNames.size() * (gap);
        int leftSpace = width - GlobalParams.margin*2 - neededSpace;
        int x = leftSpace/2;
        for(Key key : buttonsNames) {
            Position position = new Position(x,y);
            buttonsMap.put(position, new RoundButton(key, position, diameter));
            x += gap;
        }
        return buttonsMap;
    }
}
