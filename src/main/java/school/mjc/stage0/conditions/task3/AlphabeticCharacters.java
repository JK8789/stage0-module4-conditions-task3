package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void vowelDeterminer(char character) {
        String symbolChar = Character. toString(character);
        if (symbolChar.matches("[a-zA-Z&&[aeiou]]")){
            System.out.println("Vowel");
        } else if (symbolChar.matches("[a-zA-Z&&[^aeiou]]")){
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        vowelDeterminer('e');
    }
}
