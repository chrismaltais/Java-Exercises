// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string ""

public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
