import java.util.Arrays;
import java.util.HashSet;

class Solution {
	public int[] solution(int[] answers) {
		int[][] pattern = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		int[] score = new int[3]; // a b c
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < pattern.length; j++) {
				if (answers[i] == pattern[j][i % pattern[j].length])
					score[j]++;
			}
		}
		System.out.println("길이"+pattern.length);

		int maxScore = Arrays.stream(score).max().getAsInt();
		HashSet<Integer> integers = new HashSet<>();

		for (int i = 0; i < score.length; i++) {
			if (score[i] == maxScore) {
				integers.add(i + 1);
			}
		}

		return integers.stream().sorted().mapToInt(i -> i).toArray();
	}
}