import java.util.HashSet;

class Solution {
	public int[] solution(int[] answers) {
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < answers.length; i = i + 5) {
			if (answers[i] == 1) a++;
			if (i+1 < answers.length && answers[i+1] == 2) a++;
			if (i+2 < answers.length && answers[i+2] == 3) a++;
			if (i+3 < answers.length && answers[i+3] == 4) a++;
			if (i+4 < answers.length && answers[i+4] == 5) a++;
		}

		for (int i = 0; i < answers.length; i = i + 8) {
			if (answers[i] == 2) b++;
			if (i+1 < answers.length && answers[i+1] == 1) b++;
			if (i+2 < answers.length &&answers[i+2] == 2) b++;
			if (i+3 < answers.length && answers[i+3] == 3) b++;
			if (i+4 < answers.length && answers[i+4] == 2) b++;
			if (i+5 < answers.length && answers[i+5] == 4) b++;
			if (i+6 < answers.length && answers[i+6] == 2) b++;
			if (i+7 < answers.length && answers[i+7] == 5) b++;
		}

		for (int i = 0; i < answers.length; i = i + 10) {
			if (answers[i] == 3) c++;
			if (i+1 < answers.length && answers[i+1] == 3) c++;
			if (i+2 < answers.length && answers[i+2] == 1) c++;
			if (i+3 < answers.length && answers[i+3] == 1) c++;
			if (i+4 < answers.length && answers[i+4] == 2) c++;
			if (i+5 < answers.length && answers[i+5] == 2) c++;
			if (i+6 < answers.length && answers[i+6] == 4) c++;
			if (i+7 < answers.length && answers[i+7] == 4) c++;
			if (i+8 < answers.length && answers[i+8] == 5) c++;
			if (i+9 < answers.length && answers[i+9] == 5) c++;
		}
		HashSet<Integer> integers = new HashSet<>();

		if (a>b && a>c) {
			integers.add(1);
		}
		if (b>c && b>a) {
			integers.add(2);
		}
		if (c>b && c>a) {
			integers.add(3);
		}
		if (a == b && a > c) {
			integers.add(1);
			integers.add(2);
		}
		if (a == c && c > b) {
			integers.add(1);
			integers.add(3);
		}
		if (c == b && c > a) {
			integers.add(2);
			integers.add(3);
		}


		if (a == b && a == c) {
			integers.add(1);
			integers.add(2);
			integers.add(3);
		}



		int[] answer = integers.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}