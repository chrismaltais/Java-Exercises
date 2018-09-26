import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GoogleKickStartQueens {
	public static int GBusesVisitingEachCity(int cityToCheck, int[] busRanges) {
		int timesHit = 0;
		for (int i = 0; i < busRanges.length - 1; i+=2) {
			if (cityToCheck >= busRanges[i] && cityToCheck <= busRanges[i + 1]) {
				timesHit++;
			}
		}
		return timesHit;
	}
	public static void main(String[] args) {
		String fileName = "A-small-attempt0.txt";
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fileReader);
			int numTestCases = Integer.parseInt(br.readLine());
			int totalTestCases = numTestCases;
			while (numTestCases > 0) {
				int numGBuses = Integer.parseInt(br.readLine());
				int[] busRanges = new int[numGBuses * 2];
				String[] busRangesString = br.readLine().split(" ");
				int i = 0;
				for (String s : busRangesString) {
					busRanges[i] = Integer.parseInt(s);
					i++;
				}
				int numCitiesToCheck = Integer.parseInt(br.readLine());
				int[] result = new int[numCitiesToCheck];
				for (int j = 0; j < numCitiesToCheck; j++) {
					int cityToCheck = Integer.parseInt(br.readLine());
					result[j] = GBusesVisitingEachCity(cityToCheck, busRanges);
				}
				System.out.print("Case #" + (totalTestCases - numTestCases + 1) + ":");
				for (int j = 0; j < result.length; j++) {
					System.out.print(" " + result[j]);
					
				}
				System.out.println("");
				numTestCases--;
				br.readLine(); // Skip Empty Line
			}
		
		} catch(IOException ex) {
	            System.out.println("Error reading file '" + ex.getMessage() + "'");
		}
		
		try {
			
		} catch (Exception e) {
			
		}
		/*String NumTestCasesString = bufferedReader.readLine();
		 */
		

	}

}
