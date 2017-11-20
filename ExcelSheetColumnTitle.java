// Given a positive integer, return its corresponding column title as appear in an Excel sheet.
// EX) 1 -> A, 2 -> B, ..., 26 -> Z, 27 -> AA, 28 -> AB, ...

class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.insert(0, (char)((n) % 26 + 'A'));
            n /= 26;
        }
        return result.toString();
    }
}