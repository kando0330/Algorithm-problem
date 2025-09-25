import java.util.ArrayList;
import java.util.Comparator;

class Solution {
	public int[] solution(int N, int[] stages) {
		double[] failRates = new double[N];
		int[] notClearedUserCount = new int[N];
		int[] stagesReachUserCount = new int[N];
		ArrayList<Integer> tempAnswer = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] >= i+1) {
					if (stages[j] > i+1) {
						stagesReachUserCount[i]++;
					}
					else {
						stagesReachUserCount[i]++;
						notClearedUserCount[i]++;
					}
				}
			}
			failRates[i] = (double)notClearedUserCount[i] / stagesReachUserCount[i]; // 모든 i 에 대한 실패율

			System.out.println("failRates[i] = " + failRates[i]);

			tempAnswer.add(i + 1);
		}
		tempAnswer.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {

				if ((failRates[o2 - 1] - failRates[o1 - 1]) > 0 ) {
					System.out.println("teststse");
					return 1;
				}

				if ((failRates[o2 - 1] - failRates[o1 - 1]) < 0 ) {
					System.out.println("teststse");
					return -1;
				}
				return (int)(failRates[o2 - 1] - failRates[o1 - 1]);
			}
		});
		int[] answer = tempAnswer.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}