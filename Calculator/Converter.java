
import java.util.TreeMap;

public class Converter {
    TreeMap<Character, Integer> romanKeyMap = new TreeMap<>();

    public Converter() {
        romanKeyMap.put('I',1);
        romanKeyMap.put('V',5);
        romanKeyMap.put('X',10);
        romanKeyMap.put('L',50);
        romanKeyMap.put('C',100);
        romanKeyMap.put('D',500);
        romanKeyMap.put('M',1000);
    }

    public boolean isRoman(char number) {
        if (String.valueOf(number).length() != 1) {
            return false;
        }
        return romanKeyMap.containsKey(number);
    }
}
