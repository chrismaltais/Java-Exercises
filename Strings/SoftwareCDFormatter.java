// Given a non-empty string S consisting of N characters,
// representing a license key to format, and an integer K,
// returns the license key formatted according to the description above.
// For example, in the license key "2-4A0r7-4k" there are two dashes which split it into three groups of lengths 1, 5 and 2, respectively.
// If we want each group to be of length 4, then we would have to reinsert the dashes. Thus, for K = 4,
// the correctly formatted string is "24A0-R74K".

public class SoftwareCD {
	public static String formatter(String S, int K) {
		if (K == 1) return S.toUpperCase();
		StringBuilder finalString = new StringBuilder();
		String[] cutS = S.split("-");
		String noHyphenString = String.join("", cutS);
		finalString.append(noHyphenString);
		for (int i = noHyphenString.length() - K; i > 0; i-=K) {
			finalString.insert(i, '-');
		}
		return finalString.toString().toUpperCase();
		
		// i-=K
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "r";
		int K = 1;
		System.out.println(formatter(S, K));
	}

}
