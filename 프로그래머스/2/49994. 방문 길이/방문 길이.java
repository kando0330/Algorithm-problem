import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String dirs) {
		int cur_x = 0;
		int cur_y = 0;
		int answer = 0;

		int[][][] matrix_dir = new int[11][11][4];
		for (int i = 0; i < dirs.length(); i++) {
			char dir = dirs.charAt(i);
			if (dir == 'U' && cur_y + 1 <= 5) {
				if (matrix_dir[cur_x + 5][cur_y + 5][0] == 0) {
					matrix_dir[cur_x + 5][cur_y + 5][0] = 1;
					if (cur_y + 6 <= 10)
						matrix_dir[cur_x + 5][cur_y + 6][1] = 1;
					answer++;
				}
				cur_y++;

			} // 0,1
			else if (dir == 'D' && cur_y - 1 >= -5) {
				if (matrix_dir[cur_x + 5][cur_y + 5][1] == 0) {
					matrix_dir[cur_x + 5][cur_y + 5][1] = 1;
					if (cur_y + 4 <= 10)
						matrix_dir[cur_x + 5][cur_y + 4][0] = 1;
					answer++;
				}
				cur_y--;

			} // 0,-1
			else if (dir == 'R' && cur_x + 1 <= 5) {
				if (matrix_dir[cur_x + 5][cur_y + 5][2] == 0) {
					matrix_dir[cur_x + 5][cur_y + 5][2] = 1;
					if (cur_x + 6 <= 10)
						matrix_dir[cur_x + 6][cur_y + 5][3] = 1;

					answer++;
				}
				cur_x++;

			} // 1,0
			else if (dir == 'L' && cur_x - 1 >= -5) {

				if (matrix_dir[cur_x + 5][cur_y + 5][3] == 0) {
					matrix_dir[cur_x + 5][cur_y + 5][3] = 1;
					if (cur_x + 4 <= 10)
						matrix_dir[cur_x + 4][cur_y + 5][2] = 1;

					answer++;
				}
				cur_x--;

			} // -1,0

		}

		return answer;
	}
}