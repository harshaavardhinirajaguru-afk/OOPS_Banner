public class CharacterPatternMap{
    Character character;
    String[]pattern;
    public CharacterPatternMap(Character character,String[]pattern){
    public Character getCharacter(){
    public static CharacterPatternMap[] createCharacterPatternMaps(){
    public static String[] getCharacterPattern(char ch,CharacterMap[] charMaps){
    public static void printMessage(String message,CharacterPatternMap[] charMaps){
        public static void main(String[]args){
            CharacterPatternMap[] charMaps= createCharacterPatternMaps();
            String message="OOPS";
            printMessage(message,charMaps);
        }
    }
    }
    }
    }
    }
}