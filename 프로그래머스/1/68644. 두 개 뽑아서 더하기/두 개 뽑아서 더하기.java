import java.util.HashSet;

class Solution {
	public int[] solution(int[] numbers) {
		HashSet<Integer> integers = new HashSet<>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				integers.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = integers.stream().sorted().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}