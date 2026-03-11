public class OOPSBannerApp {

    // Inner static class to store character and pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Create objects for O, P, S
        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Store the word OOPS using objects
        CharacterPatternMap[] word = {o, o, p, s};

        int height = o.getPattern().length;

        // Print banner
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}