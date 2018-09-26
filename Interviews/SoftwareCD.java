
public class SoftwareCD {
	public static String formatter(String S, int K) {
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
