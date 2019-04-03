# Activity 3

## Questions

1. public static String flip() {
	int r = (int) (Math.random() * 2);
	if (r == 0) return "tails";
	return "heads";
}

2. public static boolean arePermutations(int[] list1, int[] list2) {
	for (int i = 0; i < list1.length; i++) {
		boolean hasMatch = false;
		for (int j = 0; j < list2.length; j++) {
			if (list2[j] == list1[i]) {
				hasMatch = true;
			}
		}
		if (! hasMatch) return false;
	}
	return true;
}

3. 0, 1, 1