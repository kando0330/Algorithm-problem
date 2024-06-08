class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i = 0;
        
        for (int n: num_list) {
            if (n < 0) {
                answer = i;
                break;
            }
            else 
                i++;
        }
        
        if (i >= num_list.length)
            return -1;
        
        return answer;
    }
}