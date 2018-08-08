// widths[] is array w 26 integers, each containing the "width" of a letter on a sheet
// S is a String
// Given line of 100, count how many lines it takes to write the string

public int[] numberOfLines(int[] widths, String S) {
    int[] result = new int[2];
    int lineValue = 0;
    int numLines = 1;
    int charVal;
    for (int i = 0; i < S.length(); i++) {
        charVal = widths[S.charAt(i) - 97];
        lineValue += charVal;
        if (lineValue > 100) {
            lineValue = 0;
            numLines++;
            lineValue += charVal;
        }
    }
    result[0] = numLines;
    result[1] = lineValue;
    return result;
}
