package ex01;

public class Lotto {
	public static void main(String[] args) {
		//로또 번호 생성
		//1~45까지의 정수
		//총6개의수
		//중복이 없음
		//0~0.999999999=>1보다 작다.
	int [] num1=new int[6];
	int [] lotto=new int[6];
	int i,j,k;
	int cnt,b_cnt;
		//비교
		//5<=10
		//{5,10, , , , ,]
		//5,10 <-5
		//5==5 참인가?
		//10 == 10 참인가?
		//모든 수와 비교
		for(i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(j=0;j<i;j++) {//비교 대상
				if(lotto[j]==lotto[i]) {
					i--;										 
				}
			}
		}
	//비교도 해야됨
	//5
	//5 10
	//5 10 4
	// 5와 같은가 10이랑 같은가 4랑 같은가 확인
	//확장된 for문
	//foreach
	//for(하나의 자료형과 변수 : 리스트  or set or 배열)
	//lotto 배열속의 값을 하나씩 꺼내어 num변수에 담는것을 반복한다.
		for(int num:lotto) {			
			System.out.println(num);
		}
	}
}
