class Solution {
    public String buildMorseString(String word) {
        StringBuilder morseWord = new StringBuilder();
        String[] morseLetters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            int index = letters[i] - 97; // ascii
            morseWord.append(morseLetters[index]);
        }
        return morseWord.toString();
    }

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        for (String word : words) {
            word = buildMorseString(word);
            set.add(word);
        }
        return set.size();
    }
}
