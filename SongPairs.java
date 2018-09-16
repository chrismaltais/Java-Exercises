public long getSongs(int[] arr) {
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < arr.length; i++) {
		int seconds = arr[i] % 60;
		if (map.containsKey(seconds)) {
			map.put(seconds, map.get(seconds) + 1);
		} else {
			map.put(seconds, 1);
		}
	}
	int pairs = 0;
	int doubleCount = 0;
	if (map.containsKey(30)) {
		int n = map.get(30);
		pairs += factorial(n) / factorial(2) * factorial(n - 2); //Absolute value?
	}
	map.remove(30); // Do the same for 0
	pairs += getCombincations(0);
	for (int i = 0; i < arr.length; i++) {
		int seconds = arr[i] % 60;
		if (seconds == 0 || seconds == 60) {
			continue;
		}
		doubleCount += map.get(60 - seconds);
	}
	return pairs + doubleCount/2;
}

public long factorial(n) {}
