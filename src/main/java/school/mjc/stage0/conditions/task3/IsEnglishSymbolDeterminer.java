package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void isEnglishSymbol(char symbol) {
        String symbolChar = Character. toString(symbol);
        if (symbolChar.matches("[a-zA-Z]+")){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }

    public static void main(String[] args) {
        isEnglishSymbol('b');
    }
}
