// Implement function ToLowerCase() that has a string parameter str,
// and returns the same string in lowercase.

// ASCII:
// A = 65
// Z = 90
// a = 97
// z = 122

class Solution {
    public String toLowerCase(String str) {
        char[] letters = new char[str.length()];
        int asciiKey;
        for (int i = 0; i < str.length(); i++) {
            asciiKey = (int)str.charAt(i);
            if (asciiKey <= 90 && asciiKey >= 65) {
                asciiKey += 32;
            }
            letters[i] = (char)asciiKey;
        }
        return new String(letters);
    }
}
