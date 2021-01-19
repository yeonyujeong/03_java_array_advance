package step3_01.arrayAdvance;

/*
 * # 달팽이
 * 
 * 1	2	3	4	5	
 * 16	17	18	19	6	
 * 15	24	25	20	7	
 * 14	23	22	21	8	
 * 13	12	11	10	9
 * 
 * 
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 * 
 * 1)2)3)4) 반복
 */


public class ArrayEx50_내정답 {		//2021.01.08		9:02 - 

	public static void main(String[] args) {

		int garo = 5;
		int sero = 5;
		int num = 1;
		int cnt = 0;
		int dirCnt = 5;
		int dir = 0;  //0 오른쪽 1 아래 2 왼쪽 3 위
		int[][] snail = new int[garo][sero];
		int turn = 0;
		int y = -1;
		int x = -1;
		while(true) {
			
			//오른쪽으로
			if(dir % 4 == 0) {
				for (int i = 0; i < dirCnt; i++) {
					snail[turn][i +turn] = num;
					num++;
				}
				dir++;cnt++;if(cnt % 2 == 1) {dirCnt--;}
			}
			//아래로
			else if(dir % 4 == 1) {
				for (int i = turn+1; i < dirCnt + 1; i++) {
					snail[i][4-turn] = num;
					num++;
				}dir++;cnt++;if(cnt % 2 == 1) {dirCnt--;}
			}
			//왼쪽으로
			else if(dir % 4 == 2) {
				for (int i = dirCnt - 1; i >= 0; i--) {
					snail[4-turn][i] = num;
					num++;
				}dir++;cnt++;if(cnt % 2 == 1) {dirCnt--;}
			}
			//위로
			else if(dir % 4 == 3) {
				for (int i = dirCnt; i > 0; i--) {
					snail[i+turn][turn] = num;
					num++;
				}dir++;cnt++;if(cnt % 2 == 1) {dirCnt--;}
				turn++;
			}
			
			if(num == 25) {
				for (int i = 0; i < snail.length; i++) {
					for (int j = 0; j < snail[i].length; j++) {
						System.out.print(snail[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
			}
			
		}
		
		
		
		
		
	}

}
