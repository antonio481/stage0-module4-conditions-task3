package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if(!(Character.UnicodeBlock.of(character).equals(Character.UnicodeBlock.BASIC_LATIN)))
            System.out.println("wrong alphabet!");
        else if(character=='a'||character=='e'||character=='y'||character=='u'||character=='o'||character=='i')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
